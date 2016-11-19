package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK查询订单参数
 * @author yangzhibin@che001.com
 * @date 2016/9/5
 */
public class SDKGetTxParamVO extends BaseDO{

    /**
     * ssoId登录方的ssoid,为了验证用户是否登录
     */
    private String ssoId;

    /**
     * orderId订单id
     */
    private String orderId;

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
