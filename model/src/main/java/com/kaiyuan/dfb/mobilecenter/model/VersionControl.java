package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by a on 2016/8/3.
 *
 * @liuming 版本管理versionControl   collection
 */
@Document(collection = "versionControl")
public class VersionControl extends BaseDO {

    @Field("id")
    private String id; //编号
    private String versionNumber; //产品版本号
    private String versionId;       //产品版本编号（Android）
    private String versionType;   // 产品类型（Android/IOS）
    private Integer isUpgrade;      //是否强制升级（0:是，1：否）（其他版本是否需要强制升级到该版本）
    private String isUpdate;       //是否需要强制更新(M_U:是  N_U：否)（该版本是否需要强制更新到其他版本）
    private String updateUrl;       //更新地址
    private String content;         //强制更新提示内容
    private String updateVersion;   //更新版本号
    private String userId;          //操作人Id
    private String userName;        //操作人名称
    private Integer logicalDel;     //逻辑删除
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
    private long version;        //系统版本

    public String getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
    }

    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIsUpgrade() {
        return isUpgrade;
    }

    public void setIsUpgrade(Integer isUpgrade) {
        this.isUpgrade = isUpgrade;
    }

    public Integer getLogicalDel() {
        return logicalDel;
    }

    public void setLogicalDel(Integer logicalDel) {
        this.logicalDel = logicalDel;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }
}
