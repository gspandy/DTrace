package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 交易初始化参数vo
 * @author yangzhibin@che001.com
 * @date 2016/8/8
 */
public class InitTxParamVO extends BaseDO{

    /**
     * 付款方手机号
     */
    private String sourcePhone;

    /**
     * 收款方手机号
     */
    private String targetPhone;

    /**
     * 渠道pc,wap,android,ios (必须是这四个之一)
     */
    private String channel;

    /**
     * In-收款,Out-付款
     */
    private String direction;

    /**
     * Direction=in时，必须传，付款用户卡秘钥
     */
    private String sourceCsc;

    /**
     * 用户交易时的备注
     */
    private String note;

    /**
     * 金额（元为单位）
     */
    private String amount;

    /**
     * 描述
     */
    private String description;

    public String getSourcePhone() {
        return sourcePhone;
    }

    public void setSourcePhone(String sourcePhone) {
        this.sourcePhone = sourcePhone;
    }

    public String getTargetPhone() {
        return targetPhone;
    }

    public void setTargetPhone(String targetPhone) {
        this.targetPhone = targetPhone;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSourceCsc() {
        return sourceCsc;
    }

    public void setSourceCsc(String sourceCsc) {
        this.sourceCsc = sourceCsc;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
