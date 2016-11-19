package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.BankAccount;


@SuppressWarnings("serial")
public class BankAccountForMobile extends BankAccount {
    private String bankName;
    private String abbreviation;
    private Boolean oldBankCard;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Boolean getOldBankCard() {
        return oldBankCard;
    }

    public void setOldBankCard(Boolean oldBankCard) {
        this.oldBankCard = oldBankCard;
    }

    @Override
    public String toString() {
        return "BankAccountForMobile [bankName=" + bankName + ", abbreviation=" + abbreviation + ", id=" + id
                + ", logicalDel=" + logicalDel + ", createTime=" + createTime + ", updateTime=" + updateTime
                + ", version=" + version + ", getBankName()=" + getBankName() + ", getAbbreviation()="
                + getAbbreviation() + ", getEntityType()=" + getEntityType() + ", getVerifyType()=" + getVerifyType()
                + ", getUserId()=" + getUserId() + ", getBankId()=" + getBankId() + ", getAccountName()="
                + getAccountName() + ", getType()=" + getType() + ", getBranchNumber()=" + getBranchNumber()
                + ", getCardHolder()=" + getCardHolder() + ", getCardNumber()=" + getCardNumber()
                + ", getAccountProp()=" + getAccountProp() + ", getBranchOffice()=" + getBranchOffice()
                + ", getOperatorId()=" + getOperatorId() + ", getOwnership()=" + getOwnership() + ", getIdCard()="
                + getIdCard() + ", getStatus()=" + getStatus() + ", getProvince()=" + getProvince() + ", getCity()="
                + getCity() + ", getBankUserNumber()=" + getBankUserNumber() + ", getFundTransType()="
                + getFundTransType() + ", getVerifyResult()=" + getVerifyResult() + ", getVerifyNotes()="
                + getVerifyNotes() + ", getModifyResult()=" + getModifyResult() + ", getPreBankAccountId()="
                + getPreBankAccountId() + ", getOldBankCard()=" + getOldBankCard() + ", getPendingConfirm()="
                + getPendingConfirm() + ", getMessageId()=" + getMessageId() + ", getConfirmNotes()=" + getConfirmNotes() + ", toString()=" + super.toString()
                + ", superToString()=" + superToString() + ", getId()=" + getId() + ", getLogicalDel()="
                + getLogicalDel() + ", getCreateTime()=" + getCreateTime() + ", getUpdateTime()=" + getUpdateTime()
                + ", getVersion()=" + getVersion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}
