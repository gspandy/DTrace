package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/28
 */
public class ValidatePhoneParamVO extends BaseDO {

    /**
     * 收款方手机号码
     */
    private String targetPhone;

    /**
     * 支付方手机号码
     */
    private String sourcePhone;

    /**
     * in代表收款,out代表付款
     */
    private String direction;

    /**
     * 渠道
     * pc/wap/android/iphone
     * 哪里进行的初始化交易 当前交易订单归属哪个平台 无论后续操作在哪个平台完成
     */
    private String channel;

    public String getTargetPhone() {
        return targetPhone;
    }

    public void setTargetPhone(String targetPhone) {
        this.targetPhone = targetPhone;
    }

    public String getSourcePhone() {
        return sourcePhone;
    }

    public void setSourcePhone(String sourcePhone) {
        this.sourcePhone = sourcePhone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
