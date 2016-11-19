package com.kaiyuan.dfb.mobilecenter.model.billing;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 分期订单分期实体
 * @author yangzhibin@che001.com
 * @date 2016/10/31
 */
public class StageOrderPeriodVO extends BaseDO{

    /**
     * 分期订单明细id
     */
    private String id;

    /**
     * 总期数
     */
    private String totalPeriodNum;

    /**
     * 第几期
     */
    private String period;

    /**
     * 创建日期
     */
    private String createDate;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 对应的账单id
     */
    private String billingId;

    /**
     * 金额
     */
    private String amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalPeriodNum() {
        return totalPeriodNum;
    }

    public void setTotalPeriodNum(String totalPeriodNum) {
        this.totalPeriodNum = totalPeriodNum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }
}
