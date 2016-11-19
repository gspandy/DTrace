package com.kaiyuan.dfb.mobilecenter.model.commodity;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/7
 */
public class Goods extends BaseDO {
    private String goodsId; // dfb商品编码，自定义
    private String saleCompanyId; // 代理商id
    private String saleCompanyName; // 代理商名称
    private String thirdGoodsId; // 商品编码
    private String thirdGoodsName; // 商品名称
    private Integer goodsType;  // 0:手机充值 1：加油卡充值
    private String classId; //大类id
    private String className; //大类名称：运营商
    private String subClassId; // 小类名称
    private String subClassName; // 小类名称：省份
    private Long salePrice; // 售价
    private Long perValue; // 面值
    private Long inPrice; // 供货价
    private Integer status; // 	商品状态	0：正常 1：备货中
    private String vendor; // 第三方供应商	OFCZ
    private String vendorName; // 供应商名称	欧飞充值

    private String id;
    private Integer logicalDel;
    private Date createTime;
    private Date updateTime;
    private Long version;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSaleCompanyId() {
        return saleCompanyId;
    }

    public void setSaleCompanyId(String saleCompanyId) {
        this.saleCompanyId = saleCompanyId;
    }

    public String getSaleCompanyName() {
        return saleCompanyName;
    }

    public void setSaleCompanyName(String saleCompanyName) {
        this.saleCompanyName = saleCompanyName;
    }

    public String getThirdGoodsId() {
        return thirdGoodsId;
    }

    public void setThirdGoodsId(String thirdGoodsId) {
        this.thirdGoodsId = thirdGoodsId;
    }

    public String getThirdGoodsName() {
        return thirdGoodsName;
    }

    public void setThirdGoodsName(String thirdGoodsName) {
        this.thirdGoodsName = thirdGoodsName;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(String subClassId) {
        this.subClassId = subClassId;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getPerValue() {
        return perValue;
    }

    public void setPerValue(Long perValue) {
        this.perValue = perValue;
    }

    public Long getInPrice() {
        return inPrice;
    }

    public void setInPrice(Long inPrice) {
        this.inPrice = inPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
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
}
