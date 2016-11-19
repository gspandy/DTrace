package com.kaiyuan.dfb.mobilecenter.service.impl;

import com.kaiyuan.dfb.mobilecenter.model.account.AccountDO;
import com.kaiyuan.dfb.mobilecenter.model.indemnity.IndemnityDetailDO;
import com.kaiyuan.dfb.mobilecenter.model.indemnity.IndemnityDetailResultVO;
import com.kaiyuan.dfb.mobilecenter.service.AccountService;
import com.kaiyuan.platform.common.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author yangzhibin@che001.com
 * @Date 2016/6/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class AccountServiceTest {

    @Resource
    private AccountService accountService;

    @Test
    public void getAccountByUserId() throws Exception {
        String userId = "6e502423-86cb-483c-97c9-8a1dc25dc971";
        List<AccountDO> accountDOs = accountService.getAccountByUserId(userId);
        Assert.assertNotNull(accountDOs);
    }

    @Test
    public void getIndemnityDetailList() {
        String userId = "c11c5d0d-67fb-46a8-88d8-bf8525e7ad57";
        IndemnityDetailResultVO indemnityDetailResultVO = accountService.getIndemnityDetailList(userId, 1, 10);
        System.out.println("---------------------------totalNum=" + indemnityDetailResultVO.getTotalNum());
        for (IndemnityDetailDO detailDO : indemnityDetailResultVO.getIndemnityDetailDOs()) {
            System.out.println(detailDO);
        }
        System.out.println("###############################");
    }

    @Test
    public void getAccountObjByUserId() {
        String token = "2AOmIirHEKKRZbrelTyjkGehGDjETtW05jRl5fSE2SXsOMEc4m99AGTBQPf7i6td9ddI0";
        String userId = "6e502423-86cb-483c-97c9-8a1dc25dc971";
        Account account = accountService.getAccountObjByUserId(token, userId);
        System.out.println(account.getId());
    }

    @Test
    public void getQYDAmount(){
        String ssoId="4098688117190892793";
        String amount=accountService.getQYDAmount(ssoId);
        System.out.println("amount="+amount);
    }


    @Test
    public void getAccountByUserIdAndAccountType(){
        String userId="a7ac816f-4917-44c4-acdc-61df8d531c5f";
        String type="消费账户";
        AccountDO account=accountService.getAccountByUserIdAndAccountType(userId,type);
        System.out.println("----account-----"+account);
    }
}
