package com.kaiyuan.dfb.mobilecenter.model.billing;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.List;

/**
 * 分期订单详情
 * @author yangzhibin@che001.com
 * @date 2016/10/31
 */
public class StageOrderDetailVO extends BaseDO{

    /**
     * 分期订单id
     */
    private String id;

    /**
     * 订单创建日期
     */
    private String createDate;

    /**
     * 外部订单号
     */
    private String outOrderNo;

    /**
     * 订单来源
     */
    private String orderSource;

    /**
     * 总期数
     */
    private String totalPeriodNum;


    /**
     * 每期金额
     */
    private String amount;

    /**
     * 订单名称
     */
    private String name;

    /**
     * 订单详情列表
     */
    private List<StageOrderPeriodVO> stageOrderPeriodVOs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getTotalPeriodNum() {
        return totalPeriodNum;
    }

    public void setTotalPeriodNum(String totalPeriodNum) {
        this.totalPeriodNum = totalPeriodNum;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StageOrderPeriodVO> getStageOrderPeriodVOs() {
        return stageOrderPeriodVOs;
    }

    public void setStageOrderPeriodVOs(List<StageOrderPeriodVO> stageOrderPeriodVOs) {
        this.stageOrderPeriodVOs = stageOrderPeriodVOs;
    }

}
