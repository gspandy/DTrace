package com.kaiyuan.dfb.mobilecenter.service.impl;

import com.kaiyuan.dfb.mobilecenter.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/8/1
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Override
    public List<String> getAccountByUserId(String userId) {
        List<String> result=new ArrayList<>();
        result.add("yangzhibin");
        return result;
    }

}
