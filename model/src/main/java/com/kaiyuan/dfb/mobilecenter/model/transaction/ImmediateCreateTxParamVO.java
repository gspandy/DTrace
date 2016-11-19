package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/9/26.
 */
public class ImmediateCreateTxParamVO extends BaseDO {
    private String loggedId;    //当前登录用户userid
    private String royalty_paramet; //付款分户账金额(AF_1&&CF_2/消费账户支付1元，现金账户支付2元
    private String totalAmount;//交易金额（元为单位，精确到小数点后两位）
    private String targetPhone;//收款方手机号
    private String sourcePhone;//付款方手机号
    private String direction;//in-收款  out-付款
    private String note;//用户交易描述
    private String channel;//渠道(pc,ios,android,wap)
    private String sourceCsc;//卡安全码   direction值为in时 必须有值
    private String description;//订单描述
    private String requestId;//如果是第三方业务的订单，为第三方业务订单号（便于后面的第三方查询交易状态）

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLoggedId() {
        return loggedId;
    }

    public void setLoggedId(String loggedId) {
        this.loggedId = loggedId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRoyalty_paramet() {
        return royalty_paramet;
    }

    public void setRoyalty_paramet(String royalty_paramet) {
        this.royalty_paramet = royalty_paramet;
    }

    public String getSourceCsc() {
        return sourceCsc;
    }

    public void setSourceCsc(String sourceCsc) {
        this.sourceCsc = sourceCsc;
    }

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

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
