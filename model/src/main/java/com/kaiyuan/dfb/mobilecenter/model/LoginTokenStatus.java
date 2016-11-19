package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/5
 */
public class LoginTokenStatus extends EntityDO {
    private String userId;
    private String token;
    private String deviceId;
    private String deviceName;
    private String mobileId;
    private String mobile;
    private int platform;
    private int status;

    private String storeId;

    public LoginTokenStatus() {
    }

    public LoginTokenStatus(String userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public LoginTokenStatus(LoginTokenStatus model) {
        super(model);
        this.userId = model.getUserId();
        this.token = model.getToken();
        this.deviceId = model.getDeviceId();
        this.deviceName = model.getDeviceName();
        this.mobile = model.getMobile();
        this.platform = model.getPlatform();
        this.status = model.getStatus();
        this.mobileId = model.getMobileId();
        this.storeId = model.getStoreId();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getMobileId() {
        return mobileId;
    }

    public void setMobileId(String mobileId) {
        this.mobileId = mobileId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getPlatform() {
        return this.platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}