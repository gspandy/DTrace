package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 供service使用的生成OTP的参数VO
 * @author yangzhibin@che001.com
 * @date 2016/9/7
 */
public class SDKGenerateOTPParamVO extends BaseDO{
    /**
     * 交易Id
     */
    private String transaction;

    /**
     * 用户userId
     */
    private String loggedId;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getLoggedId() {
        return loggedId;
    }

    public void setLoggedId(String loggedId) {
        this.loggedId = loggedId;
    }
}
