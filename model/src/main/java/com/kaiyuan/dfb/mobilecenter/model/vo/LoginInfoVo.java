package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.LoginTokenStatus;

import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/8
 */
public class LoginInfoVo extends BaseDO {
    public final String id;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    public final Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    public final Date updateTime;
    public final String deviceName;
    public final String mobileId;
    public final int platform;
    public final int status;
    public final String token;

    public LoginInfoVo(LoginTokenStatus l) {
        id = l.getId();
        createTime = l.getCreateTime();
        updateTime = l.getUpdateTime();
        deviceName = l.getDeviceName();
        mobileId = l.getMobileId();
        platform = l.getPlatform();
        status = l.getStatus();
        token = l.getToken();
    }
}
