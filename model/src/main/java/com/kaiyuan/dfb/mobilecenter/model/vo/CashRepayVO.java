package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/11/4.
 */
public class CashRepayVO extends BaseDO {
    private String userId; //用户ID
    private String billingType;//账单类型，0(消费账户)，1(分期账户)
    private String billingProcessId;//账单ID
    /**
     * 金额,字符串类型，使用现金账户还款的金额，如果大于现金账户可用金额，会返回失败。 金额单位为元，最多2位小数，例如：200.00
     */
    private String amount;
    private String type;//发起主动银行卡还款 的类型

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBillingProcessId() {
        return billingProcessId;
    }

    public void setBillingProcessId(String billingProcessId) {
        this.billingProcessId = billingProcessId;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
