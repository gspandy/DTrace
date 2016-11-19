package com.kaiyuan.dfb.mobilecenter.commons.constant;

/**
 * @author yangzhibin@che001.com
 * @date 2016/9/6
 */
public enum ResultEnum {

    ERR_SRCUSER_IS_NOT_FOUND("ERR_SRCUSER_IS_NOT_FOUND","付款方用户不存在"),
    ERR_DESTUSER_IS_NOT_FOUND("ERR_DESTUSER_IS_NOT_FOUND","收款方用户不存在"),
    ERR_SRCSERVICEACCOUNT_IS_NOT_FOUND("ERR_SRCSERVICEACCOUNT_IS_NOT_FOUND","付款方serviceaccount不存在");

    private String name;

    private String msg;

    ResultEnum(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
