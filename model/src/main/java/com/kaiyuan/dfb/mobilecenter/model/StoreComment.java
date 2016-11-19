package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by lein on 2016/4/26.
 */
@Document(collection = "StoreComment")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreComment extends EntityDO {
    @Indexed
    private String criticId; //评论人userId
    @Indexed
    private String ownerId; //被评论人userId（企业）
    private String content;
    private int mark;
    private String channel;
    private boolean isAnonymous;
    private String criticUserName; // "张*"
    private String criticFullName; // "张三"
    private String criticPhone;
    private String storeName;
    private List<PhoneNumber> storePhone;
    private List<String> storeCategory;
    private String storeType;
    private GeoLocation geoLocation; // "16.00,45.22"
    private String tags; //tag1,tag2,tag3

    public StoreComment() {
    }

    public StoreComment(String ownerId) {
        this.ownerId = ownerId;
    }

    public StoreComment(StoreComment storeComment) {
        super(storeComment);
        this.criticId = storeComment.getCriticId();
        this.ownerId = storeComment.getOwnerId();
        this.content = storeComment.getContent();
        this.mark = storeComment.getMark();
        this.channel = storeComment.getChannel();
        this.isAnonymous = storeComment.isAnonymous();
        this.criticUserName = storeComment.getCriticUserName();
        this.criticFullName = storeComment.getCriticFullName();
        this.criticPhone = storeComment.getCriticPhone();
        this.storeName = storeComment.getStoreName();
        this.storePhone = storeComment.getStorePhone();
        this.storeCategory = storeComment.getStoreCategory();
        this.storeType = storeComment.getStoreType();
        this.geoLocation = storeComment.getGeoLocation();
        this.tags = storeComment.getTags();
    }

    public String getCriticId() {
        return criticId;
    }

    public void setCriticId(String criticId) {
        this.criticId = criticId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public String getCriticUserName() {
        return criticUserName;
    }

    public void setCriticUserName(String criticUserName) {
        this.criticUserName = criticUserName;
    }

    public String getCriticFullName() {
        return criticFullName;
    }

    public void setCriticFullName(String criticFullName) {
        this.criticFullName = criticFullName;
    }

    public String getCriticPhone() {
        return criticPhone;
    }

    public void setCriticPhone(String criticPhone) {
        this.criticPhone = criticPhone;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<PhoneNumber> getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(List<PhoneNumber> storePhone) {
        this.storePhone = storePhone;
    }

    public List<String> getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(List<String> storeCategory) {
        this.storeCategory = storeCategory;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
