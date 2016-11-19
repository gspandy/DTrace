package com.kaiyuan.dfb.mobilecenter.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.mongodb.core.mapping.Field;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 * <p>通用的基础DO,所有的DO类都要继承这个类,实现了序列化标识接口并且重写了toString方法,继承这个DO类之后就不用重写toString方法</p>
 * @Author yangzhibin@che001.com
 * @Date 2016/4/8
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityDO implements Serializable {

    @Field("id")
    private String id;
    private Integer logicalDel;
    
    private Date createTime;
    private Date updateTime;

    protected Long version;

    public EntityDO() {
    }

    public EntityDO(EntityDO entityDO) {
        this.id = entityDO.getId();
        this.logicalDel = entityDO.getLogicalDel();
        this.createTime = entityDO.getCreateTime();
        this.updateTime = entityDO.getUpdateTime();
        this.version = entityDO.getVersion();
    }

    public Integer getLogicalDel() {
        return logicalDel;
    }

    public void setLogicalDel(Integer logicalDel) {
        this.logicalDel = logicalDel;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
