package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 校验手机号返回结果
 * @author yangzhibin@che001.com
 * @date 2016/7/27
 */
public class ValidatePhoneVO extends BaseDO {

    private String dfbPhone;

    private String dfbName;

    private Integer status;

    private String msg;

    public String getDfbPhone() {
        return dfbPhone;
    }

    public void setDfbPhone(String dfbPhone) {
        this.dfbPhone = dfbPhone;
    }

    public String getDfbName() {
        return dfbName;
    }

    public void setDfbName(String dfbName) {
        this.dfbName = dfbName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
