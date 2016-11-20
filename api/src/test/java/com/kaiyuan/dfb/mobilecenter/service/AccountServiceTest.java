package com.kaiyuan.dfb.mobilecenter.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dubbo-consumer.xml")
public class AccountServiceTest {

    @Resource
    private AccountService accountService;

    @Test
    public void getAccountByUserId() throws Exception {
        String userId = "6e502423-86cb-483c-97c9-8a1dc25dc971";
        List<String> accountDOs = accountService.getAccountByUserId(userId);
        Assert.assertNotNull(accountDOs);
    }
}
