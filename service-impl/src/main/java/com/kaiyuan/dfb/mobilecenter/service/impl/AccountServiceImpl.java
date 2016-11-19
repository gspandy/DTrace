package com.kaiyuan.dfb.mobilecenter.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.kaiyuan.dfb.common.code.CommonCode;
import com.kaiyuan.dfb.common.exception.CommonException;
import com.kaiyuan.dfb.mobilecenter.commons.constant.CodeMsgEnum;
import com.kaiyuan.dfb.mobilecenter.commons.constant.ResultCode;
import com.kaiyuan.dfb.mobilecenter.commons.constant.URLConstant;
import com.kaiyuan.dfb.mobilecenter.commons.exception.CustomException;
import com.kaiyuan.dfb.mobilecenter.commons.util.JsonUtil;
import com.kaiyuan.dfb.mobilecenter.commons.util.MsgUtil;
import com.kaiyuan.dfb.mobilecenter.commons.util.ZkPropertyUtil;
import com.kaiyuan.dfb.mobilecenter.model.account.AccountDO;
import com.kaiyuan.dfb.mobilecenter.model.common.HttpStatusCodeBody;
import com.kaiyuan.dfb.mobilecenter.model.indemnity.IndemnityDetailDO;
import com.kaiyuan.dfb.mobilecenter.model.indemnity.IndemnityDetailResultVO;
import com.kaiyuan.dfb.mobilecenter.service.AccountService;
import com.kaiyuan.platform.common.model.Account;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/8/1
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private RestTemplate restTemplate;

    @Override
    public List<AccountDO> getAccountByUserId(String userId) {
        List<AccountDO> result = new ArrayList<>();
        String accountUrl = "http://" + ZkPropertyUtil.get("component.account") + "/account/getCollection?userId=" + userId;
        ResponseEntity<JsonNode> response = null;
        try {
            response = restTemplate.getForEntity(accountUrl, JsonNode.class);
            logger.debug("###调用账务系统的accountUrl={}###返回值{}###", accountUrl, response);
            if (response != null) {
                if (response.getStatusCode() == HttpStatus.OK) {
                    JsonNode responseBody = response.getBody();
                    if (responseBody != null) {
                        JsonNode datas = responseBody.get("data");
                        if (datas != null) {
                            for (JsonNode data : datas) {
                                AccountDO account = JsonUtil.getObject(data, AccountDO.class);
                                result.add(account);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("###调用账务系统的accountUrl={}###返回值{}###出错,错误信息:", accountUrl, response, e);
        }
        return result;
    }

    @Override
    public AccountDO getAccountByUserIdAndAccountType(String userId, String typeRemark) {
        final String ACCOUNTURL = "http://" + ZkPropertyUtil.get("component.account") + "/account/getCollection?userId=" + userId + "&typeRemark=" + typeRemark;
        try {
            JSONObject jsonObject = restTemplate.getForObject(ACCOUNTURL, JSONObject.class);
            logger.debug("###调用账务系统的accountUrl={}###返回值{}###", ACCOUNTURL, jsonObject);
            if (jsonObject != null) {
                JSONArray datas = jsonObject.getJSONArray("data");
                if (datas != null && datas.size() > 0) {
                    JSONObject data = datas.getJSONObject(0);
                    if (data != null) {
                        AccountDO account = new AccountDO();
                        account.setStatus(data.getString("status"));
                        account.setBalance(data.getBigDecimal("balance"));
                        account.setCreditLine(data.getBigDecimal("creditLine"));
                        account.setDirect(data.getIntValue("direct"));
                        account.setLockedFunds(data.getBigDecimal("lockedFunds"));
                        account.setManualStatus(data.getString("manualStatus"));
                        account.setType(data.getString("type"));
                        account.setTypeRemark(data.getString("typeRemark"));
                        account.setUserGuid(data.getString("userGuid"));
                        return account;
                    }
                }
            }
        } catch (Exception e) {
            logger.error("###调用账务系统的accountUrl={}###出错,错误信息:", ACCOUNTURL, e);
        }
        return null;
    }

    /**
     * 获取总记录数
     *
     * @param contentRange
     * @return
     */
    private Integer getTotalCount(String contentRange) {
        try {
            String[] strings = contentRange.split("/");
            if (strings.length > 1 && StringUtils.isNumeric(strings[1])) {
                return Integer.valueOf(strings[1]);
            }
        } catch (Exception e) {
            logger.error("###从contentRange中获取总记录数失败,失败原因:", e);
        }
        return 0;
    }

    @Override
    public IndemnityDetailResultVO getIndemnityDetailList(String userId, Integer from, Integer size) {
        IndemnityDetailResultVO result = new IndemnityDetailResultVO();
        final String DFB = ZkPropertyUtil.get("component.dfb");
        final String URL = "http://" + DFB + "/dfb/indemnityAmount2/detail/list?flag=QYD&sort=amount,-start_date&participant_id=" + userId;
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.RANGE, " entities=" + (from + 1) + "-" + (from + size));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<IndemnityDetailDO[]> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(URL, HttpMethod.GET, entity, IndemnityDetailDO[].class);
            String contentRange = responseEntity.getHeaders().get("Content-Range").get(0);
            result.setTotalNum(getTotalCount(contentRange));
            IndemnityDetailDO[] indemnityDetailDOs = responseEntity.getBody();
            result.setIndemnityDetailDOs(Arrays.asList(indemnityDetailDOs));
        } catch (HttpStatusCodeException e) {
            logger.error("###获取信用保证金记录失败,失败原因:{}", e.getResponseBodyAsString());
            throw generateCustomeException(e);
        } catch (Exception e) {
            logger.error("###获取信用保证金记录URL={}###返回值{}###出错,错误信息:", URL, responseEntity, e);
        }
        return result;
    }

    @Override
    public Account getAccountObjByUserId(String token, String userId) throws CustomException {
        String banking = ZkPropertyUtil.get("component.banking");
        final String URL = "http://" + banking + "/account?user_id=" + userId;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        HttpEntity entity = new HttpEntity<>(headers);
        ResponseEntity<Account[]> result;
        try {
            result = restTemplate.exchange(URL, HttpMethod.GET, entity, Account[].class);
            if (result.getStatusCode() == HttpStatus.OK) {
                return result.getBody()[0];
            }
        } catch (HttpStatusCodeException e) {
            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                return null;
            } else {
                throw new CustomException("服务器错误");
            }
        }
        return null;
    }

    @Override
    public String getQYDAmount(String ssoId) throws CustomException {
        final String URL = URLConstant.CASHIER + "/cashier/pay/getAmount";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        JSONObject paramJson = new JSONObject();
        paramJson.put("payerId", ssoId);
        paramJson.put("channel", "QYD");
        paramJson.put("productType", "DFB");
        HttpEntity request = new HttpEntity(paramJson, headers);
        logger.debug("###参数={}##URL={}###", paramJson, URL);
        JSONObject jsonObject = restTemplate.postForObject(URL, request, JSONObject.class);
        logger.debug("###参数={}##URL={}##返回值={}###", paramJson, URL, jsonObject);
        int code = jsonObject.getIntValue("code");
        if (ResultCode.SUCCESS_CODE == code) {
            JSONArray datas = jsonObject.getJSONArray("data");
            if (datas != null && datas.size() > 0) {
                JSONObject data = datas.getJSONObject(0);
                return data.getString("amount");
            }
        }
        throw new CustomException(code, jsonObject.getString("msg"));
    }


    @Override
    public boolean isFrozen(String userId, String accountName) {
        try {
            AccountDO accountDO = getAccountByUserIdAndAccountType(userId, accountName);
            if (accountDO != null) {
                if ("FROZEN".equals(accountDO.getStatus()) || "MANUAL_FROZEN".equals(accountDO.getManualStatus())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            logger.error("###获取账户冻结状态失败,入参userId={}##accountName={}##失败原因:", userId, accountName, e);
            throw new CommonException(CommonCode.ACCOUNT_GET_FROZEN_STAUTS_ERROR);
        }
    }

    @Override
    public Integer getCreditAccountStatus(String userId, String accountName) {
        UriComponents URL = UriComponentsBuilder.newInstance()
                .scheme("http").host(URLConstant.BACKEND_ACCOUNT_STATUS)
                .path("/frontFromBackend/account/accountInfo")
                .queryParam("userId", userId)
                .build();
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
            headers.set("X-Auth-Token", "FranchieeTokenForKyPay");
            HttpEntity request = new HttpEntity(headers);
            ResponseEntity<JSONObject> result = restTemplate.exchange(URL.toString(), HttpMethod.GET, request, JSONObject.class);
            if (result.getStatusCode() == HttpStatus.OK) {
                JSONObject json = result.getBody();
                JSONObject data = json.getJSONObject("data");
                JSONArray accounts = data.getJSONArray("list");
                for (int i = 0; i < accounts.size(); i++) {
                    JSONObject account = accounts.getJSONObject(i);
                    String accountTypeName = account.getString("accountTypeName");
                    String nodeStatus = account.getString("nodeStatus");
                    if (accountName.equals(accountTypeName)) {
                        switch (nodeStatus) {
                            case "已批准": {
                                return 2;
                            }
                            case "已终止": {
                                return 3;
                            }
                            default:
                                return 1;
                        }
                    }
                }
            }
            return 0;
        } catch (Exception e) {
            logger.error("###获取信用账户授信状态失败,入参userId={}##accountName={}##url={}##,错误原因:", userId, accountName, URL.toString(), e);
            throw new CommonException(CommonCode.CREDIT_ACCOUNT_STATUS_ERROR);
        }

    }

    /**
     * 获取自定义异常信息
     *
     * @param e
     * @return
     */
    private CustomException generateCustomeException(HttpStatusCodeException e) {
        String body = e.getResponseBodyAsString();
        HttpStatusCodeBody statusCode = JsonUtil.toObj(body, HttpStatusCodeBody.class);
        HttpStatusCodeBody.CodeMessage codeMessage = statusCode.getErrors().get(0);
        CodeMsgEnum codeMsg = MsgUtil.getMsg(codeMessage.getCode());
        CustomException customException = new CustomException(codeMsg.getCode(), codeMsg.getMsg());
        throw customException;
    }
}
