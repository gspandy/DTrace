package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.TxContacts;

import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/28
 */
public class TxContactsNoSysVo extends BaseDO {
    private String id;
    private String fullName;
    private String phone;
    private String userId;
    private String traderUserId;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date updateTime;

    public TxContactsNoSysVo() {
    }

    public TxContactsNoSysVo(TxContacts tx) {
        this.id = tx.getId();
        this.fullName = tx.getFullName();
        this.phone = tx.getPhone();
        this.userId = tx.getUserId();
        this.traderUserId = tx.getTraderUserId();
        this.createTime = tx.getCreateTime();
        this.updateTime = tx.getUpdateTime();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTraderUserId() {
        return traderUserId;
    }

    public void setTraderUserId(String traderUserId) {
        this.traderUserId = traderUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
