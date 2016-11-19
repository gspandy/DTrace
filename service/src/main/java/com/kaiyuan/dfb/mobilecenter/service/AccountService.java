package com.kaiyuan.dfb.mobilecenter.service;

import com.kaiyuan.dfb.mobilecenter.commons.annotation.Trace;
import com.kaiyuan.dfb.mobilecenter.commons.exception.CustomException;
import com.kaiyuan.dfb.mobilecenter.commons.util.UUIDGenerator;
import com.kaiyuan.dfb.mobilecenter.model.account.AccountDO;
import com.kaiyuan.dfb.mobilecenter.model.indemnity.IndemnityDetailResultVO;
import com.kaiyuan.platform.common.model.Account;

import java.util.List;

/**
 * 账务service
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/31
 */
public interface AccountService {

    /**
     * 根据用户id获取账户信息
     *
     * @param userId
     * @return
     */
    @Trace(spanId = "查询账户")
    List<AccountDO> getAccountByUserId(String userId) throws CustomException;

    /**
     * 根据用户id和账户类型获取账户信息
     *
     * @param userId
     * @param typeRemark
     * @return
     */
    AccountDO getAccountByUserIdAndAccountType(String userId, String typeRemark) throws CustomException;

    /**
     * 获取信用保证金明细列表
     *
     * @param userId
     * @param begin
     * @param size
     * @return
     * @throws CustomException
     */
    IndemnityDetailResultVO getIndemnityDetailList(String userId, Integer begin, Integer size) throws CustomException;

    /**
     * 获取Account
     *
     * @param userId
     * @param token
     * @return
     */
    Account getAccountObjByUserId(String token, String userId) throws CustomException;


    /**
     * yangzhibin@che001.com
     * 根据用户ssoId获取轻易贷余额
     *
     * @param ssoId
     * @return
     */
    String getQYDAmount(String ssoId) throws CustomException;


    /**
     * <p>是否冻结</p>
     *
     * @param userId      用户id
     * @param accountName 账户名称
     * @return true冻结，false未冻结
     * @author yangzhibin@che001.com
     * @date 2016/11/17
     */
    boolean isFrozen(String userId, String accountName) throws CustomException;

    /**
     * <p>查看授信业务的授信状态</p>
     *
     * @param userId
     * @param accountName
     * @return 0未授信 1授信中 2授信被驳回 3授信完成
     * @author yangzhibin@che001.com
     * @date 2016/11/17
     */
    Integer getCreditAccountStatus(String userId, String accountName) throws CustomException;
}
