package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.GeoLocation;
import com.kaiyuan.platform.common.model.enumeration.EntityType;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * 
 * @author Milly 我要纠错
 *
 */
@Document(collection = "correct")
public class Correct extends BaseDO {

    private static final long serialVersionUID = -6790299560019028117L;
    @Field("id")
    private String id;
    private Integer logicalDel;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date updateTime;
    protected Long version;
    private String content;
    private String type;
    private String subUserName;
    private String subPhone;// 点击其他错误时用户提交
    private String subUserId;
    private String subRegPhone;
    private String merchantName;// 用户提交
    private String merchantPhone;// 用户提交
    private String storeOwnerId;
    private String storeName;// 数据库
    private String storePhone;// 数据库
    private GeoLocation geoLocation;
    private String subUserLocation;


    public String getContent() {
        return content;
    }

    public String getSubRegPhone() {
        return subRegPhone;
    }

    public void setSubRegPhone(String subRegPhone) {
        this.subRegPhone = subRegPhone;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubUserName() {
        return subUserName;
    }

    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
    }

    public String getSubPhone() {
        return subPhone;
    }

    public void setSubPhone(String subPhone) {
        this.subPhone = subPhone;
    }

    public String getSubUserId() {
        return subUserId;
    }

    public void setSubUserId(String subUserId) {
        this.subUserId = subUserId;
    }

    public String getStoreOwnerId() {
        return storeOwnerId;
    }

    public void setStoreOwnerId(String storeOwnerId) {
        this.storeOwnerId = storeOwnerId;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getSubUserLocation() {
        return subUserLocation;
    }

    public void setSubUserLocation(String subUserLocation) {
        this.subUserLocation = subUserLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLogicalDel() {
        return logicalDel;
    }

    public void setLogicalDel(Integer logicalDel) {
        this.logicalDel = logicalDel;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Correct [content=" + content + ", type=" + type + ", subUserName=" + subUserName + ", subPhone="
                + subPhone + ", subUserId=" + subUserId + ", storeOwnerId=" + storeOwnerId + ", geoLocation="
                + geoLocation + ", merchantName=" + merchantName + ", merchantPhone=" + merchantPhone + ", storeName="
                + storeName + ", storePhone=" + storePhone + ", subRegPhone=" + subRegPhone + ", subUserLocation="
                + subUserLocation + ", getId()=" + getId() + ", getLogicalDel()=" + getLogicalDel()
                + ", getCreateTime()=" + getCreateTime() + ", getUpdateTime()=" + getUpdateTime() + ", getVersion()="
                + getVersion() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}
