package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/10/12.
 */
public class BankAccLatest extends BaseDO {
    private String id;
    private String userId;
    private String bankId;
    private int status;
    private int type;
    private String cardNumber;
    private Long version;
    private Integer pendingConfirm;
    private String confirmNotes;
    private Integer verifyResult;
    private String verifyNotes;
    private String cardHolder;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getConfirmNotes() {
        return confirmNotes;
    }

    public void setConfirmNotes(String confirmNotes) {
        this.confirmNotes = confirmNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPendingConfirm() {
        return pendingConfirm;
    }

    public void setPendingConfirm(Integer pendingConfirm) {
        this.pendingConfirm = pendingConfirm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVerifyNotes() {
        return verifyNotes;
    }

    public void setVerifyNotes(String verifyNotes) {
        this.verifyNotes = verifyNotes;
    }

    public Integer getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(Integer verifyResult) {
        this.verifyResult = verifyResult;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
