package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 170014 交易常用联系人
 */
@Document(collection = "TxContacts")
@CompoundIndexes({
        @CompoundIndex(name = "userId_phone", def = "{'userId' : 1, 'phone': 1}"),
        @CompoundIndex(name = "userId_traderUserId", def = "{'userId' : 1, 'traderUserId': 1}")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxContacts extends EntityDO {

    private static final long serialVersionUID = -6455596221554445744L;
    @JsonIgnore
    private String userName;
    private String fullName;
    private String phone;
    @Indexed
    private String userId;//登录人userId
    @JsonIgnore
    private String remark;

    private Boolean top; //置顶状态  true置顶，false不置顶，默认false
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date topTime; //置顶时间
    private Map<String, String> txData; //最近一条消息数
    private int num; //未读消息数
    private Boolean readable; // 是否可读  true可读，false不可读，默认true
    private String traderUserId; // 交易方user

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean isTop() {
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

    public void setTxData(Map<String, String> txData) {
        this.txData = txData;
    }

    public Map<String, String> getTxData() {
        return txData;
    }

    public Object getTxDataAsObject(String key) {
        return txData.get(key);
    }

    public String getTxDataAsString(String key) {
        return (String) txData.get(key);
    }

    public Integer getTxDataAsInteger(String key) {

        String s = (String) txData.get(key);

        if (Strings.isNullOrEmpty(s)) {
            return null;
        }

        return Integer.parseInt(s);
    }

    public Long getTxDataAsLong(String key) {

        String s = (String) txData.get(key);

        if (Strings.isNullOrEmpty(s)) {
            return null;
        }

        return Long.parseLong(s);
    }

    public Double getTxDataAsDouble(String key) {

        String s = (String) txData.get(key);

        if (Strings.isNullOrEmpty(s)) {
            return null;
        }

        return Double.parseDouble(s);
    }

    public void addTxData(String key, String value) {
        if (txData == null) {
            txData = new HashMap<>();
        }

        txData.put(key, value);
    }

    public void addAllTxData(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }

        if (txData == null) {
            txData = new HashMap<>();
        }

        txData.putAll(map);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Boolean isReadable() {
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

}
