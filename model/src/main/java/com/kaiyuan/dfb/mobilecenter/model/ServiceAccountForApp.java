package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.enumeration.EntityType;

import java.util.Map;

public class ServiceAccountForApp extends DataEntity {

    private static final long serialVersionUID = 2L;

    @Override
    public EntityType getEntityType() {
        return EntityType.MOBILE_USER_INFO_APP;
    }

    private String mId;
    private String mStatus;
    private String mFullName;
    private String mPhone;
    private String mIdCardCode;
    private String mCompanyLegalRepName;
    private String mCompanyLegalRepPersonalId;
    private Long mVersion;
    private Map<String, Object> nameCheck;
    private String frostStatus;

    private String storeCheckStatus;
    private String storeCheckReason;
    private String creditStatus;
    private String creditReason;
    private boolean initial;//true 已授信，false未授信
    private String creditType;//FIRSTCREDIT 首授，ADDCREDIT 追授

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmIdCardCode() {
        return mIdCardCode;
    }

    public void setmIdCardCode(String mIdCardCode) {
        this.mIdCardCode = mIdCardCode;
    }

    public String getmCompanyLegalRepName() {
        return mCompanyLegalRepName;
    }

    public void setmCompanyLegalRepName(String mCompanyLegalRepName) {
        this.mCompanyLegalRepName = mCompanyLegalRepName;
    }

    public String getmCompanyLegalRepPersonalId() {
        return mCompanyLegalRepPersonalId;
    }

    public void setmCompanyLegalRepPersonalId(String mCompanyLegalRepPersonalId) {
        this.mCompanyLegalRepPersonalId = mCompanyLegalRepPersonalId;
    }

    public Long getmVersion() {
        return mVersion;
    }

    public void setmVersion(Long mVersion) {
        this.mVersion = mVersion;
    }

    public Map<String, Object> getNameCheck() {
        return nameCheck;
    }

    public void setNameCheck(Map<String, Object> nameCheck) {
        this.nameCheck = nameCheck;
    }

    public String getFrostStatus() {
        return frostStatus;
    }

    public void setFrostStatus(String frostStatus) {
        this.frostStatus = frostStatus;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getStoreCheckStatus() {
        return storeCheckStatus;
    }

    public void setStoreCheckStatus(String storeCheckStatus) {
        this.storeCheckStatus = storeCheckStatus;
    }

    public String getStoreCheckReason() {
        return storeCheckReason;
    }

    public void setStoreCheckReason(String storeCheckReason) {
        this.storeCheckReason = storeCheckReason;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getCreditReason() {
        return creditReason;
    }

    public void setCreditReason(String creditReason) {
        this.creditReason = creditReason;
    }

    public boolean isInitial() {
        return initial;
    }

    public void setInitial(boolean initial) {
        this.initial = initial;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    @Override
    public String toString() {
        return "ServiceAccountForApp [mId=" + mId + ", mStatus=" + mStatus + ", mFullName=" + mFullName + ", mPhone="
                + mPhone + ", mIdCardCode=" + mIdCardCode + ", mCompanyLegalRepName=" + mCompanyLegalRepName
                + ", mCompanyLegalRepPersonalId=" + mCompanyLegalRepPersonalId + ", mVersion=" + mVersion
                + ", nameCheck=" + nameCheck + ", frostStatus=" + frostStatus + ", id=" + id + ", logicalDel="
                + logicalDel + ", createTime=" + createTime + ", updateTime=" + updateTime + ", version=" + version
                + ", getEntityType()=" + getEntityType() + ", getmId()=" + getmId() + ", getmStatus()=" + getmStatus()
                + ", getmFullName()=" + getmFullName() + ", getmPhone()=" + getmPhone() + ", getmIdCardCode()="
                + getmIdCardCode() + ", getmCompanyLegalRepName()=" + getmCompanyLegalRepName()
                + ", getmCompanyLegalRepPersonalId()=" + getmCompanyLegalRepPersonalId() + ", getmVersion()="
                + getmVersion() + ", getNameCheck()=" + getNameCheck() + ", getFrostStatus()=" + getFrostStatus()
                + ", storeCheckReason='" + storeCheckReason + '\'' + ", storeCheckStatus='" + storeCheckStatus + '\''
                + ", creditReason='" + creditReason + '\'' + ", creditStatus='" + creditStatus + ", initial='"
                + initial + '\'' + ", creditType='" + creditType + '\'' + '\'' + ", getId()=" + getId() + ", getLogicalDel()=" + getLogicalDel()
                + ", getCreateTime()=" + getCreateTime() + ", getUpdateTime()=" + getUpdateTime() + ", getVersion()="
                + getVersion() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}