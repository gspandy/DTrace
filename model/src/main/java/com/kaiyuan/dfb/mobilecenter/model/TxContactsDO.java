package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Map;

/**
 * 交易常用联系人
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/13
 */
@Document(collection = "TxContacts")
public class TxContactsDO extends EntityDO {

    @Field("id")
    private String id;
    /**
     * 用户名
     */
    private String fullName;
    /**
     * 用户电话
     */
    private String phone;
    /**
     * 当前登录用户userId
     */
    private String userId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 置顶状态  true置顶，false不置顶，默认false
     */
    private Boolean top;
    /**
     * 置顶时间
     */
    private Date topTime;
    /**
     * 最近一条消息数
     */
    private Map<String, String> txData;
    /**
     * 未读消息数
     */
    private int num;
    /**
     * 是否可读  true可读，false不可读，默认true
     */
    private Boolean readable;
    /**
     * 添加的用户userId
     */
    private String traderUserId;
    /**
     * 逻辑删除0未删除,1已删除
     */
    private Integer logicalDel;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Date getTopTime() {
        return topTime;
    }

    public void setTopTime(Date topTime) {
        this.topTime = topTime;
    }

    public Map<String, String> getTxData() {
        return txData;
    }

    public void setTxData(Map<String, String> txData) {
        this.txData = txData;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public String getTraderUserId() {
        return traderUserId;
    }

    public void setTraderUserId(String traderUserId) {
        this.traderUserId = traderUserId;
    }

    public Integer getLogicalDel() {
        return logicalDel;
    }

    public void setLogicalDel(Integer logicalDel) {
        this.logicalDel = logicalDel;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
