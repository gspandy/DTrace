package com.kaiyuan.dfb.mobilecenter.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.kaiyuan.dfb.mobilecenter.service.AccountService;
import com.kaiyuan.dfb.usercenter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/8/1
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private UserService userService;

    @Override
    public List<String> getAccountByUserId(String userId) {
        String traceId= (String) RpcContext.getContext().get("traceId");
        System.out.println("---traceId-----"+traceId);
        List<String> result=new ArrayList<>();
        result.add("yangzhibin");
        userService.getAccountByUserId(userId);
        return result;
    }

}
