package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 担保交易确认返回VO
 *
 * @author yangzhibin@che001.com
 * @date 2016/8/11
 */
public class ApproveTxResultVO extends BaseDO {

    /**
     * 交易id
     */
    private String id;

    /**
     * 交易号
     */
    private String number;

    /**
     * 父交易号
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
     * 金额
     */
    private String amount;

    /**
     * 描述
     */
    private String description;

    /**
     * 产品类型
     */
    private String productType;

    /**
     * 交易类型
     */
    private String type;

    /**
     * 状态
     */
    private String status;

    /**
     * 付款方名称
     */
    private String nameOfMainSrc;

    /**
     * 收款方名称
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
     * 备注
     */
    private String notes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
