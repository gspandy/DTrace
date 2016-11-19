package com.kaiyuan.dfb.mobilecenter.model.billing;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 分期订单展示VO
 * @author yangzhibin@che001.com
 * @date 2016/10/27
 */
public class StageOrderVO extends BaseDO{

    /**
     * 订单id
     */
    private String id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 创建日期
     */
    private String createDate;

    /**
     * 还款总额
     */
    private String amount;

    /**
     * 还款期数
     */
    private String period;

    /**
     * 还款总期数
     */
    private String totalPeriod;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getTotalPeriod() {
        return totalPeriod;
    }

    public void setTotalPeriod(String totalPeriod) {
        this.totalPeriod = totalPeriod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
