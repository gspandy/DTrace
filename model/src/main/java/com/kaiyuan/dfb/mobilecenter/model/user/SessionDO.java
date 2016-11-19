package com.kaiyuan.dfb.mobilecenter.model.user;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
/**
 * @author yangzhibin@che001.com
 * @date 2016/7/12
 */
public class SessionDO extends BaseDO {

    private String id;
    private String userId;
    private String employeeId;
    private String storeId;
    private String storeParentId;
    private String storeOwnerId;
    private String storeName;
    private boolean isEmployeeSession;
    private String username;
    private String employeeSSOToken;
    private String profileId;
    private String ssoId;

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreParentId() {
        return storeParentId;
    }

    public void setStoreParentId(String storeParentId) {
        this.storeParentId = storeParentId;
    }

    public String getStoreOwnerId() {
        return storeOwnerId;
    }

    public void setStoreOwnerId(String storeOwnerId) {
        this.storeOwnerId = storeOwnerId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public boolean isEmployeeSession() {
        return isEmployeeSession;
    }

    public void setEmployeeSession(boolean employeeSession) {
        isEmployeeSession = employeeSession;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeeSSOToken() {
        return employeeSSOToken;
    }

    public void setEmployeeSSOToken(String employeeSSOToken) {
        this.employeeSSOToken = employeeSSOToken;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }
}
