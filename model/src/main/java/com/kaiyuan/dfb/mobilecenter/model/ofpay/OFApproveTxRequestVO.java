package com.kaiyuan.dfb.mobilecenter.model.ofpay;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * @author yangzhibin@che001.com
 * @date 2016/11/10
 */
public class OFApproveTxRequestVO extends BaseDO{

    /**
     * otp
     */
    private String otp;

    /**
     * 交易id
     */
    private String transactionId;

    /**
     * channel 用来区分IOS ANDROID
     */
    private String channel;


    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

}
