package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/19
 */
public class TransactionDO extends EntityDO {

    private String loggedId;

    private String royalty_paramet;

    private String totalAmount;

    private String targetPhone;

    private String sourcePhone;

    private String direction;

    private String note;

    private String channel;

    private String sourceCsc;

    private String description;

    private String requestId;

    public String getLoggedId() {
        return loggedId;
    }

    public void setLoggedId(String loggedId) {
        this.loggedId = loggedId;
    }

    public String getRoyalty_paramet() {
        return royalty_paramet;
    }

    public void setRoyalty_paramet(String royalty_paramet) {
        this.royalty_paramet = royalty_paramet;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSourceCsc() {
        return sourceCsc;
    }

    public void setSourceCsc(String sourceCsc) {
        this.sourceCsc = sourceCsc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
