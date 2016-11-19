package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/9/26.
 */
public class ImmediateApproveTxParamVO extends BaseDO {
    private String transactionId;//交易ID
    private String otp;//OTP验证码
    private String loggedId;//登录的userid
    private String channel;//渠道(pc,ios,android,wap)

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLoggedId() {
        return loggedId;
    }

    public void setLoggedId(String loggedId) {
        this.loggedId = loggedId;
    }

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
}
