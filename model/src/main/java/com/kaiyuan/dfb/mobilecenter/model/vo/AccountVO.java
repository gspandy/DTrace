package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 账户信息
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/29
 */
public class AccountVO extends BaseDO {

    /**
     * 类型
     * 1-消费账户
     * 2-现金账户
     * 3-奖励账户
     * 4-轻易贷保证金账户
     * 5-垫付宝保证金账户
     * 6-冻结资金
     * 7-分期账户
     */
    private Integer type;

    /**
     * 类型描述
     */
    private String desc;

    /**
     * 金额(单位为元)
     */
    private String amount;

    /**
     * 授信额度
     */
    private String accountCreditLine;

    /**
     * 账户状态
     * 1-正常
     * 2-冻结
     * 3-取消
     */
    private Integer status;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAccountCreditLine() {
        return accountCreditLine;
    }

    public void setAccountCreditLine(String accountCreditLine) {
        this.accountCreditLine = accountCreditLine;
    }
}
