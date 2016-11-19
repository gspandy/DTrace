package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.enumeration.EntityType;

public class CreditStatus extends DataEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -5678166075745453358L;
    private String reason;
    private String initial;
    private String status;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String isInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public EntityType getEntityType() {
        return null;
    }

    @Override
    public String toString() {
        return "CreditStatus [reason=" + reason + ", initial=" + initial + ", status=" + status + '\'' + ", getId()="
                + getId() + ", getLogicalDel()=" + getLogicalDel() + ", getCreateTime()=" + getCreateTime()
                + ", getUpdateTime()=" + getUpdateTime() + ", getVersion()=" + getVersion() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}
