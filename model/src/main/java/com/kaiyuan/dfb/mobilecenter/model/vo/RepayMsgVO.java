package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/11/8.
 * 分期账户还款返回model
 */
public class RepayMsgVO extends BaseDO {
    private String billingProcessId;//分期账单id
    private int resCode;//该分期账单还款的结果code
    private String resMessage;//该分期账单还款结果信息

    public String getBillingProcessId() {
        return billingProcessId;
    }

    public void setBillingProcessId(String billingProcessId) {
        this.billingProcessId = billingProcessId;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMessage() {
        return resMessage;
    }

    public void setResMessage(String resMessage) {
        this.resMessage = resMessage;
    }
}
