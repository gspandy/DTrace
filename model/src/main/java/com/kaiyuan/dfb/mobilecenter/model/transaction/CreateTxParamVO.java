package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 担保交易创建参数VO
 *
 * @author yangzhibin@che001.com
 * @date 2016/8/11
 */
public class CreateTxParamVO extends BaseDO {

    /**
     * 交易id
     */
    private String transactionId;

    /**
     * 付款分户账金额(AF_1&&CF_2/消费账户支付1元，现金账户支付2元/)
     */
    private String royalty_paramet;

    /**
     * 交易总金额
     */
    private String totalAmount;

    /**
     * 渠道(pc,ios,android,wap)
     */
    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRoyalty_paramet() {
        return royalty_paramet;
    }

    public void setRoyalty_paramet(String royalty_paramet) {
        this.royalty_paramet = royalty_paramet;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
