package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.GeoLocation;
import com.kaiyuan.platform.common.model.enumeration.EntityType;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * @author Milly
 *         用户活动区域统计
 */
@Document(collection = "activityArea")
public class ActivityArea extends BaseDO {

    private static final long serialVersionUID = -3950846980270341625L;
    @Field("id")
    protected String id;
    private String userId;
    private String phone;
    private String userName;
    private String userType;
    private String channel;//使用平台
    private String productVersion;// 当前产品版本号
    private String equipmentType;// 设备型号
    private List<GeoLocation> geoLocation;
    @JsonIgnore
    protected Integer logicalDel;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    protected Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    protected Date updateTime;
    protected Long version;

    public List<GeoLocation> getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(List<GeoLocation> geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLogicalDel() {
        return logicalDel;
    }

    public void setLogicalDel(Integer logicalDel) {
        this.logicalDel = logicalDel;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

}
