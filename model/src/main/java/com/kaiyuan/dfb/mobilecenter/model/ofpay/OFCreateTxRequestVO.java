package com.kaiyuan.dfb.mobilecenter.model.ofpay;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/10
 */
public class OFCreateTxRequestVO {
    private String phone;
    private String perValue;
    private String goodsId;
    private String channel;
    private String fundType;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPerValue() {
        return perValue;
    }

    public void setPerValue(String perValue) {
        this.perValue = perValue;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }
}
