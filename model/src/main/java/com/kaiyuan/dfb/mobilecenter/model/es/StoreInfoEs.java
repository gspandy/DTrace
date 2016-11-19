package com.kaiyuan.dfb.mobilecenter.model.es;

import com.kaiyuan.platform.common.model.es.Location;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.util.Date;
import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/25
 */
@Document(indexName = "che001_store", type = "store_info")
public class StoreInfoEs {
    @Id
    private String id;
    private Integer logicalDel;
    private Date createTime;
    private Date updateTime;
    @Version
    private Long version;
    private String store_id;
    private String user_id;
    private String store_name;
    private String store_type;
    private String store_address;
    private String store_industry;
    @GeoPointField
    private Location store_location;
    private String store_phone;
    private String store_description;
    private String distance;

    public StoreInfoEs() {
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_type() {
        return store_type;
    }

    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }

    public String getStore_address() {
        return store_address;
    }

    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }

    public String getStore_industry() {
        return store_industry;
    }

    public void setStore_industry(String store_industry) {
        this.store_industry = store_industry;
    }

    public Location getStore_location() {
        return store_location;
    }

    public void setStore_location(Location store_location) {
        this.store_location = store_location;
    }

    public String getStore_phone() {
        return store_phone;
    }

    public void setStore_phone(String store_phone) {
        this.store_phone = store_phone;
    }

    public String getStore_description() {
        return store_description;
    }

    public void setStore_description(String store_description) {
        this.store_description = store_description;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "StoreInfoEs{" +
                "id='" + id + '\'' +
                ", logicalDel=" + logicalDel +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", version=" + version +
                ", store_id='" + store_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", store_name='" + store_name + '\'' +
                ", store_type='" + store_type + '\'' +
                ", store_address='" + store_address + '\'' +
                ", store_industry='" + store_industry + '\'' +
                ", store_location=" + store_location +
                ", store_phone='" + store_phone + '\'' +
                ", store_description='" + store_description + '\'' +
                '}';
    }
}
