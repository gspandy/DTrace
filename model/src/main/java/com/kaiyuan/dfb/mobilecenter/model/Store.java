package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.common.model.*;
import com.kaiyuan.platform.common.model.StoreDescription;
import com.kaiyuan.platform.common.model.enumeration.perm.Perm;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by liuming@che001.com on 2016/9/27.
 */
@Document(collection = "store")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Store extends BaseDO {
    private static final long serialVersionUID = 2L;
    @Field("id")
    private String id;
    private Integer logicalDel;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date updateTime;
    protected Long version;
    private String name;
    private List<String> category;
    private List<Image> image;
    private List<StoreDocument> materials;
    private Address address;
    private GeoLocation geoLocation;
    private com.kaiyuan.platform.common.model.StoreDescription description;
    private List<Email> email;
    private List<PhoneNumber> phone;
    private List<StoreIm> im;
    private String owner;
    private Set<Perm> permissions;
    private String businessLicenseNo;
    private String idCardNo;
    private String parentId;
    private String subsidiaryFlag;
    private SubsidiaryInfo subsidiaryInfo;
    private String confirmIdentity;
    private String inviteCode;
    private String oldStore;
    private String storeType;
    private String classification;
    private String display;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getConfirmIdentity() {
        return confirmIdentity;
    }

    public void setConfirmIdentity(String confirmIdentity) {
        this.confirmIdentity = confirmIdentity;
    }

    public StoreDescription getDescription() {
        return description;
    }

    public void setDescription(StoreDescription description) {
        this.description = description;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public List<StoreIm> getIm() {
        return im;
    }

    public void setIm(List<StoreIm> im) {
        this.im = im;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public List<StoreDocument> getMaterials() {
        return materials;
    }

    public void setMaterials(List<StoreDocument> materials) {
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldStore() {
        return oldStore;
    }

    public void setOldStore(String oldStore) {
        this.oldStore = oldStore;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Set<Perm> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Perm> permissions) {
        this.permissions = permissions;
    }

    public List<PhoneNumber> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneNumber> phone) {
        this.phone = phone;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getSubsidiaryFlag() {
        return subsidiaryFlag;
    }

    public void setSubsidiaryFlag(String subsidiaryFlag) {
        this.subsidiaryFlag = subsidiaryFlag;
    }

    public SubsidiaryInfo getSubsidiaryInfo() {
        return subsidiaryInfo;
    }

    public void setSubsidiaryInfo(SubsidiaryInfo subsidiaryInfo) {
        this.subsidiaryInfo = subsidiaryInfo;
    }
}
