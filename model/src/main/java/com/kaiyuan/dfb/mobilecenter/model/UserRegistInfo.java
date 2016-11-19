package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.Address;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.GeoLocation;
import com.kaiyuan.platform.common.model.enumeration.EntityType;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author yangzhibin@che001.com
 * @Date 2016/6/24
 */
public class UserRegistInfo extends DataEntity {

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
    private String code;



    public UserRegistInfo() {
    }

    public EntityType getEntityType() {
        return EntityType.USERREGISTERPROFILE;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBusinessPhone() {
        return this.businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoreShop() {
        return this.storeShop;
    }

    public void setStoreShop(String storeShop) {
        this.storeShop = storeShop;
    }

    public String getSsoId() {
        return this.ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserRegistInfo{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", storeShop='" + storeShop + '\'' +
                ", businessNumber='" + businessNumber + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", profession='" + profession + '\'' +
                ", address=" + address +
                ", businessPhone='" + businessPhone + '\'' +
                ", description='" + description + '\'' +
                ", ssoId='" + ssoId + '\'' +
                ", geoLocation=" + geoLocation +
                ", code='" + code + '\'' +
                '}';
    }
}
