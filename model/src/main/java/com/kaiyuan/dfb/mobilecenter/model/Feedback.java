package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.enumeration.EntityType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Feedback")
public class Feedback extends DataEntity {

    private static final long serialVersionUID = -4635895953537326106L;
    @Field("id")
    private String id;
    private String channel; // 渠道
    private String productVersion;// 当前产品版本号
    private String content;// 反馈内容
    private String userId;// 反馈人userId
    private String userType;// 用户类型
    private String equipmentType;// 设备型号
    private String networkEnvironment;// 当前网络环境
    private String status;

    private String customerUserId;
    private String type;//SUBMIT 用户提交，默认值 REPLY 客服回复，需传参
    
    private String phone;
    private String username;
    private String fullName;
    private String screenSize;
    private String sysVersion;

    @Override
    public String toString() {
        return "Feedback{" + "channel='" + channel + '\'' + ", productVersion='" + productVersion + '\''
                + ", content='" + content + '\'' + "userId='" + userId + '\'' + "userType='" + userType + '\''
                + "equipmentType='" + equipmentType + '\'' + "networkEnvironment='" + networkEnvironment + "status='"
                + status + '\'' + "customerUserId='" + customerUserId + '\'' + "type='" + type + "phone='" + phone
                + '\'' + "username='" + username + "fullName='" + fullName + '\'' + "screenSize='" + screenSize + "sysVersion='" + sysVersion + "} "
                + super.toString();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getNetworkEnvironment() {
        return networkEnvironment;
    }

    public void setNetworkEnvironment(String networkEnvironment) {
        this.networkEnvironment = networkEnvironment;
    }

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.FEEDBACK;
    }


}
