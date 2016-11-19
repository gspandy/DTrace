package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK生成OTP参数
 * @author yangzhibin@che001.com
 * @date 2016/9/6
 */
public class SDKGenerateOTPWebParamVO extends BaseDO{

    /**
     * 交易Id
     */
    private String transaction;

    /**
     * 用户ssoId
     */
    private String ssoId;

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


    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public String getLoggedId() {
        return loggedId;
    }

    public void setLoggedId(String loggedId) {
        this.loggedId = loggedId;
    }
}
