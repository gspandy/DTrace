package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 担保交易确认
 *
 * @author yangzhibin@che001.com
 * @date 2016/8/11
 */
public class ApproveTxParamVO extends BaseDO{

    /**
     * 交易id
     */
    private String transactionId;

    /**
     * 交易确认码
     */
    private String otp;

    /**
     * 渠道(pc,ios,android,wap)
     */
    private String channel;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
