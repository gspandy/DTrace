package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.common.model.Tx;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/4
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageBodyDO extends BaseDO {

    private String transactionId;

    private String src;

    private String dest;

    private String operator;

    private String initiatedBy;

    private String txComment;

    private String description;

    private String status;

    private String amount;

    private String number;

    private Long feeAmount;

    private Long finalAmount;

    private Date createTime;

    private Date updateTime;

    public MessageBodyDO() {
    }

    public MessageBodyDO(TxMessage txMessage) {
        this.transactionId = txMessage.getTransactionId();
        this.src = txMessage.getSrc();
        this.dest = txMessage.getDest();
        this.operator = txMessage.getOperator();
        Tx.InitiatedBy initiatedBy = txMessage.getInitiatedBy();
        if (initiatedBy != null) {
            this.initiatedBy = initiatedBy.toJson();
        }
        this.txComment = txMessage.getTxComment();
        this.description = txMessage.getDescription();
        Tx.Status status = txMessage.getStatus();
        if (status != null) {
            this.status = status.toJson();
        }
        Long amount = txMessage.getAmount();
        if (amount != null) {
            this.amount = amount.toString();
        }
        this.number = txMessage.getNumber();
        this.feeAmount = txMessage.getFeeAmount();
        this.finalAmount = txMessage.getFinalAmount();
        this.createTime = txMessage.getCreateTime();
        this.updateTime = txMessage.getUpdateTime();
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public String getTxComment() {
        return txComment;
    }

    public void setTxComment(String txComment) {
        this.txComment = txComment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Long finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
