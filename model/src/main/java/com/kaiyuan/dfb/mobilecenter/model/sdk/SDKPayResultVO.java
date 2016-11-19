package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK支付返回值
 * @author yangzhibin@che001.com
 * @date 2016/9/6
 */
public class SDKPayResultVO extends BaseDO{

    /**
     * 某个子交易id（垫付宝余额支付交易ID）
     */
    private String id;

    /**
     * 垫付宝余额支付
     */
    private String type;

    /**
     * 订单交易版本号
     */
    private String version;

    /**
     * 订单总金额
     */
    private String amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
