package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 交易信息
 * @author yangzhibin@che001.com
 * @date 2016/9/18
 */
public class SDKTransVO extends BaseDO{

    /**
     * 交易id
     */
    private String id;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 消费帐户信用额度
     */
    private String number;

    /**
     * 父交易id
     */
    private String parent;

    /**
     * 付款方userid
     */
    private String src;

    /**
     * 收款方userid
     */
    private String dest;

    /**
     * 交易发起方，payer或者receiver
     */
    private String initiatedBy;

    /**
     * 系统描述
     */
    private String description;

    /**
     * 交易状态，initialized-初始化
     pending-进行中
     completed-完成
     */
    private String status;

    /**
     * 付款方用户名
     */
    private String nameOfMainSrc;

    /**
     * 收款方用户名
     */
    private String nameOfMainDest;

    /**
     * 付款方手机号
     */
    private String phoneOfPayer;

    /**
     * 收款方手机号
     */
    private String phoneOfReceiver;

    /**
     * 用户描述
     */
    private String notes;

    /**
     * 交易金额（单位：元）
     */
    private String amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
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

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
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

    public String getNameOfMainSrc() {
        return nameOfMainSrc;
    }

    public void setNameOfMainSrc(String nameOfMainSrc) {
        this.nameOfMainSrc = nameOfMainSrc;
    }

    public String getNameOfMainDest() {
        return nameOfMainDest;
    }

    public void setNameOfMainDest(String nameOfMainDest) {
        this.nameOfMainDest = nameOfMainDest;
    }

    public String getPhoneOfPayer() {
        return phoneOfPayer;
    }

    public void setPhoneOfPayer(String phoneOfPayer) {
        this.phoneOfPayer = phoneOfPayer;
    }

    public String getPhoneOfReceiver() {
        return phoneOfReceiver;
    }

    public void setPhoneOfReceiver(String phoneOfReceiver) {
        this.phoneOfReceiver = phoneOfReceiver;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
