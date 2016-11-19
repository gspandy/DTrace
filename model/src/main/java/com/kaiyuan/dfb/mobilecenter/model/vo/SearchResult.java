package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import com.kaiyuan.dfb.mobilecenter.model.GeoLocation;
import com.kaiyuan.dfb.mobilecenter.model.PhoneNumber;

import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/20
 */
public class SearchResult extends EntityDO {
    private String name;
    private String description;
    private String type;
    private GeoLocation geoLocation;
    private double distance;
    private EntityDO entity;
    private String storeType;
    private String industry;
    private Address address;
    private List<PhoneNumber> phone;
    private String ownerId;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public EntityDO getEntity() {
        return entity;
    }

    public void setEntity(EntityDO entity) {
        this.entity = entity;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneNumber> phone) {
        this.phone = phone;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
