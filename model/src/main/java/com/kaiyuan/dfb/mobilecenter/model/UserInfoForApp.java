package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kaiyuan.platform.common.conversion.json.number.CurrencyDeserializer;
import com.kaiyuan.platform.common.conversion.json.number.CurrencySerializer;
import com.kaiyuan.platform.common.model.Address;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.GeoLocation;
import com.kaiyuan.platform.common.model.enumeration.EntityType;

import java.util.Date;

public class UserInfoForApp extends DataEntity {

    private static final long serialVersionUID = 2L;

    @Override
    public EntityType getEntityType() {
        return EntityType.MOBILE_USER_INFO_APP;
    }

    private String userName;// fullName
    private String primaryPhone;
    private String primaryEmail;
    private String type;
    private String oldUser;
    private String userId;
    private String storeId;
    private String storeName;
    private String isFirstLogin;
    private String checkStatus;
    private String businessNum;
    private String IdCardCode;
    private String contractNumber;
    private String searityCode;
    private String cardNumber;
    private String classification;
    private Integer cardCount;
    private Address address;
    private String hasInviteCode;// 是否建立关系
    private String openStoreName;// 所属单位名称
    private String payCardNo;// 还款卡号
    private String receiveCardNo;// 提现卡号
    private String completeShopName;// 完善信息店铺名称
    private String completeProfession;// 完善信息从事行业
    private GeoLocation completeGeolocation;// 完善信息坐标新息
    private String completeshopNumber;// 完善信息经营电话
    private String completeDescription;// 完善信息经营电话
    private String qydAmount;//轻易贷余额
    private String stagesAmount;//分期账户余额
    @JsonDeserialize(using = CurrencyDeserializer.class)
    @JsonSerialize(using = CurrencySerializer.class)
    @JsonInclude(Include.NON_NULL)
    private Long arrearsFunds;// 欠款额度

    private String registerDate;// 注册时间

    private String payBankName;// 还款卡银行名称
    private String receiveBankName;// 提现卡银行卡名称

    private String mUserName;// username
    private String userIdenty;
    private String businessTime;
    private String otherInfo;
    private String storeCheckStatus;
    private String storeCheckReason;
    private String creditStatus;
    private String creditReason;
    private boolean initial;//true 已授信，false未授信
    private String creditType;//FIRSTCREDIT 首授，ADDCREDIT 追授

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getReceiveBankName() {
        return receiveBankName;
    }

    public void setReceiveBankName(String receiveBankName) {
        this.receiveBankName = receiveBankName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOldUser() {
        return oldUser;
    }

    public void setOldUser(String oldUser) {
        this.oldUser = oldUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(String isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getIdCardCode() {
        return IdCardCode;
    }

    public void setIdCardCode(String idCardCode) {
        IdCardCode = idCardCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getSearityCode() {
        return searityCode;
    }

    public void setSearityCode(String searityCode) {
        this.searityCode = searityCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Integer getCardCount() {
        return cardCount;
    }

    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHasInviteCode() {
        return hasInviteCode;
    }

    public void setHasInviteCode(String hasInviteCode) {
        this.hasInviteCode = hasInviteCode;
    }

    public String getOpenStoreName() {
        return openStoreName;
    }

    public void setOpenStoreName(String openStoreName) {
        this.openStoreName = openStoreName;
    }

    public String getPayCardNo() {
        return payCardNo;
    }

    public void setPayCardNo(String payCardNo) {
        this.payCardNo = payCardNo;
    }

    public String getReceiveCardNo() {
        return receiveCardNo;
    }

    public void setReceiveCardNo(String receiveCardNo) {
        this.receiveCardNo = receiveCardNo;
    }

    public String getCompleteShopName() {
        return completeShopName;
    }

    public void setCompleteShopName(String completeShopName) {
        this.completeShopName = completeShopName;
    }

    public String getCompleteProfession() {
        return completeProfession;
    }

    public void setCompleteProfession(String completeProfession) {
        this.completeProfession = completeProfession;
    }

    public GeoLocation getCompleteGeolocation() {
        return completeGeolocation;
    }

    public void setCompleteGeolocation(GeoLocation completeGeolocation) {
        this.completeGeolocation = completeGeolocation;
    }

    public String getCompleteshopNumber() {
        return completeshopNumber;
    }

    public void setCompleteshopNumber(String completeshopNumber) {
        this.completeshopNumber = completeshopNumber;
    }

    public String getCompleteDescription() {
        return completeDescription;
    }

    public void setCompleteDescription(String completeDescription) {
        this.completeDescription = completeDescription;
    }

    public Long getArrearsFunds() {
        return arrearsFunds;
    }

    public void setArrearsFunds(Long arrearsFunds) {
        this.arrearsFunds = arrearsFunds;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getUserIdenty() {
        return userIdenty;
    }

    public void setUserIdenty(String userIdenty) {
        this.userIdenty = userIdenty;
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

    public String getQydAmount() {
        return qydAmount;
    }

    public void setQydAmount(String qydAmount) {
        this.qydAmount = qydAmount;
    }

    public String getStagesAmount() {
        return stagesAmount;
    }

    public void setStagesAmount(String stagesAmount) {
        this.stagesAmount = stagesAmount;
    }

    @Override
    public String toString() {
        return "UserInfoForApp{" +
                "userName='" + userName + '\'' +
                ", primaryPhone='" + primaryPhone + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", type='" + type + '\'' +
                ", oldUser='" + oldUser + '\'' +
                ", userId='" + userId + '\'' +
                ", storeId='" + storeId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", isFirstLogin='" + isFirstLogin + '\'' +
                ", checkStatus='" + checkStatus + '\'' +
                ", businessNum='" + businessNum + '\'' +
                ", IdCardCode='" + IdCardCode + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", searityCode='" + searityCode + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", classification='" + classification + '\'' +
                ", cardCount=" + cardCount +
                ", address=" + address +
                ", hasInviteCode='" + hasInviteCode + '\'' +
                ", openStoreName='" + openStoreName + '\'' +
                ", payCardNo='" + payCardNo + '\'' +
                ", receiveCardNo='" + receiveCardNo + '\'' +
                ", completeShopName='" + completeShopName + '\'' +
                ", completeProfession='" + completeProfession + '\'' +
                ", completeGeolocation=" + completeGeolocation +
                ", completeshopNumber='" + completeshopNumber + '\'' +
                ", completeDescription='" + completeDescription + '\'' +
                ", arrearsFunds=" + arrearsFunds +
                ", registerDate=" + registerDate +
                ", payBankName='" + payBankName + '\'' +
                ", receiveBankName='" + receiveBankName + '\'' +
                ", mUserName='" + mUserName + '\'' +
                ", userIdenty='" + userIdenty + '\'' +
                ", businessTime='" + businessTime + '\'' +
                ", otherInfo='" + otherInfo + '\'' +
                ", storeCheckReason='" + storeCheckReason + '\'' +
                ", storeCheckStatus='" + storeCheckStatus + '\'' +
                ", creditReason='" + creditReason + '\'' +
                ", creditStatus='" + creditStatus + '\'' +
                ", initial='" + initial + '\'' +
                ", creditType='" + creditType + '\'' +
                "} " + super.toString();
    }
}