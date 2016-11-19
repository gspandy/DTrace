package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.Address;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.GeoLocation;
import com.kaiyuan.platform.common.model.enumeration.EntityType;

public class MobileUserRegisterProfile extends DataEntity {

    @Override
    public EntityType getEntityType() {
        return null;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -8146891749473155077L;
    private String userName;
    private String name;
    private String password;
    private String type;
    private String phone;
    private String idCard;
    private String storeShop;
    private String businessNumber;
    private String inviteCode;
    private String profession;
    private Address address;
    private String businessPhone;
    private String description;
    private String ssoId;
    private GeoLocation geoLocation;
    private String businessTime;
    private String otherInfo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoreShop() {
        return storeShop;
    }

    public void setStoreShop(String storeShop) {
        this.storeShop = storeShop;
    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

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

    @Override
    public String toString() {
        return "UserRegisterProfile [userName=" + userName + ", name=" + name + ", password=" + password + ", type="
                + type + ", phone=" + phone + ", idCard=" + idCard + ", storeShop=" + storeShop + ", businessNumber="
                + businessNumber + ", inviteCode=" + inviteCode + ", profession=" + profession + ", address=" + address
                + ", businessPhone=" + businessPhone + ", description=" + description + ", ssoId=" + ssoId
                + ", geoLocation=" + geoLocation + ", id=" + id + ", logicalDel=" + logicalDel + ", createTime="
                + createTime + ", updateTime=" + updateTime + ", version=" + version + ", getEntityType()="
                + getEntityType() + ", getUserName()=" + getUserName() + ", getName()=" + getName()
                + ", getPassword()=" + getPassword() + ", getType()=" + getType() + ", getPhone()=" + getPhone()
                + ", getInviteCode()=" + getInviteCode() + ", getIdCard()=" + getIdCard() + ", getBusinessNumber()="
                + getBusinessNumber() + ", getAddress()=" + getAddress() + ", getProfession()=" + getProfession()
                + ", getBusinessPhone()=" + getBusinessPhone() + ", getDescription()=" + getDescription()
                + ", getStoreShop()=" + getStoreShop() + ", getBusinessTime()=" + getBusinessTime()
                + ", getOtherInfo()=" + getOtherInfo() + ", getSsoId()=" + getSsoId() + ", getGeoLocation()="
                + getGeoLocation() + ", getId()=" + getId() + ", getLogicalDel()=" + getLogicalDel()
                + ", getCreateTime()=" + getCreateTime() + ", getUpdateTime()=" + getUpdateTime() + ", getVersion()="
                + getVersion() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}
