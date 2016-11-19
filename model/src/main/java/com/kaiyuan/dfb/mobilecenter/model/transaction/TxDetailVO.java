package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.platform.common.model.TxDetail;

import java.util.Date;

/**
 * @author yangzhibin@che001.com
 * @date 2016/9/21
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxDetailVO extends TxDetail {

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "UTC"
    )
    private Date createTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "UTC"
    )
    private Date updateTime;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "UTC"
    )
    private Date endTime;

    /**
     * 取消理由
     */
    private TxRefundVO refund;

    /**
     * 带符号的金额
     */
    private String signedAmount;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public Date getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public TxRefundVO getRefund() {
        return refund;
    }

    public void setRefund(TxRefundVO refund) {
        this.refund = refund;
    }

    @Override
    public String getSignedAmount() {
        return signedAmount;
    }

    @Override
    public void setSignedAmount(String signedAmount) {
        this.signedAmount = signedAmount;
    }

}
