package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.dfb_transaction.model.goods.Goods;
import com.kaiyuan.platform.common.conversion.json.number.CurrencyDeserializer;
import com.kaiyuan.platform.common.conversion.json.number.CurrencySerializer;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/9
 */
public class GoodsVo extends BaseDO {
    private String goodsId; // dfb商品编码，自定义
    private String thirdGoodsId; // 商品编码
    private String thirdGoodsName; // 商品名称
    private Integer goodsType;  // 0:手机充值 1：加油卡充值
    @JsonDeserialize(
            using = CurrencyDeserializer.class
    )
    @JsonSerialize(
            using = CurrencySerializer.class
    )
    private Long salePrice; // 售价
    private String perValue; // 面值
    private Integer status; // 	商品状态	0：正常 1：备货中

    private String id;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date updateTime;

    public GoodsVo() {
    }

    public GoodsVo(Goods goods) {
        this.goodsId = goods.getGoodsId();
        this.thirdGoodsId = goods.getThirdGoodsId();
        this.thirdGoodsName = goods.getThirdGoodsName();
        this.goodsType = goods.getGoodsType();
        this.salePrice = goods.getSalePrice();
        BigDecimal aBigDecimal = new BigDecimal(goods.getPerValue()).divide(BigDecimal.valueOf(10000L));
        this.perValue = aBigDecimal.intValue() + "";
        this.status = goods.getStatus();
        this.id = goods.getId();
        this.createTime = goods.getCreateTime();
        this.updateTime = goods.getUpdateTime();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getPerValue() {
        return perValue;
    }

    public void setPerValue(String perValue) {
        this.perValue = perValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
