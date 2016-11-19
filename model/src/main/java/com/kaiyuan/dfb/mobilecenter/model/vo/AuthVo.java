package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/8
 */

public class AuthVo extends BaseDO {
    public String access_token;
    public String refresh_token;
    public String expires_in;
    public String new_device;

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public void setNew_device(String new_device) {
        this.new_device = new_device;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public String getNew_device() {
        return new_device;
    }
}
