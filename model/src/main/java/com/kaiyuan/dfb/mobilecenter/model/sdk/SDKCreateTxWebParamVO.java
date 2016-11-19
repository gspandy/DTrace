package com.kaiyuan.dfb.mobilecenter.model.sdk;


/**
 * SDK创建交易参数
 * @author yangzhibin@che001.com
 * @date 2016/9/5
 */
public class SDKCreateTxWebParamVO extends SDKCreateTxParamVO{

    /**
     * ssoId登录方的ssoid,为了验证用户是否登录
     */
    private String ssoId;

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }
}
