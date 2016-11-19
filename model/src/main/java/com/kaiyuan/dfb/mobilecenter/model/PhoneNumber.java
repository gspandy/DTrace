package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/20
 */
public class PhoneNumber extends BaseDO{
    private String number;
    private List<String> type;

    public PhoneNumber() {
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getType() {
        return this.type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

}
