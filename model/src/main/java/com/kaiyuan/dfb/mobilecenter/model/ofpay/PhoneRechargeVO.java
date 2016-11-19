package com.kaiyuan.dfb.mobilecenter.model.ofpay;

import com.kaiyuan.platform.dfb_transaction.model.base.BaseDO;

/**
 * 话费充值记录
 * @author yangzhibin@che001.com
 * @date 2016/11/12
 */
public class PhoneRechargeVO extends BaseDO{

    /**
     * 金额
     */
    private String amount;

    /**
     * 充值号码
     */
    private String phoneNum;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 交易单号
     */
    private String txNum;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 完成时间
     */
    private String finishTime;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTxNum() {
        return txNum;
    }

    public void setTxNum(String txNum) {
        this.txNum = txNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }
}
