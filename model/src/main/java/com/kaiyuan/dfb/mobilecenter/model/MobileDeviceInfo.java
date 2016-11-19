package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/5
 */
public class MobileDeviceInfo extends EntityDO {
    private String userId;
    private String deviceId;
    private String deviceName;
    private int platform;

    public MobileDeviceInfo() {
    }

    public MobileDeviceInfo(MobileDeviceInfo mobileDeviceInfo) {
        super(mobileDeviceInfo);
        this.userId = mobileDeviceInfo.getUserId();
        this.deviceId = mobileDeviceInfo.getDeviceId();
        this.deviceName = mobileDeviceInfo.getDeviceName();
        this.platform = mobileDeviceInfo.getPlatform();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }
}
