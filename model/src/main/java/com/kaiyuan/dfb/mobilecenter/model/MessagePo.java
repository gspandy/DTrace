package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by a on 2016/7/22.
 * @liuming
 * 系统消息
 */
@Document(collection = "message")
public class MessagePo extends BaseDO {
    @Field("id")
    private String id;//编号
    private Integer logicalDel;
    protected Long version;
    private String ownerId;
    private String type;
    private String contentType;
    private String from;
    private boolean read;
    private String folder;
    private String threadId;
    private MessagePayload payload;
    private List<String> to;
    private List<String> toStore;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date createTime;      //创建时间
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date updateTime;      //更新时间
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public MessagePayload getPayload() {
        return payload;
    }

    public void setPayload(MessagePayload payload) {
        this.payload = payload;
    }
    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getToStore() {
        return toStore;
    }

    public void setToStore(List<String> toStore) {
        this.toStore = toStore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
