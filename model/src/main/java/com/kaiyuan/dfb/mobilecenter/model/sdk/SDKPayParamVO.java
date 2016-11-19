package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK支付参数
 * @author yangzhibin@che001.com
 * @date 2016/9/6
 */
public class SDKPayParamVO extends BaseDO{

    /**
     * 垫付宝订单的交易id
     */
    private String parent;

    /**
     * 支付类型（用“-”分隔开，切记保留“-”，下同），sdk里固定传AF-CF-HEE
     * AF(垫付宝消费帐户)-CF(现金帐户)-HEE(银行)
     */
    private String pay_TypeDetail;

    /**
     * 订单金额支付分配(同上)，例如使用af20支付，参数为20-0-0
     */
    private String pay_AmountDetail;

    /**
     * 订单应付总金额
     */
    private String totalAmount;

    /**
     * OTP
     */
    private String otp;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPay_TypeDetail() {
        return pay_TypeDetail;
    }

    public void setPay_TypeDetail(String pay_TypeDetail) {
        this.pay_TypeDetail = pay_TypeDetail;
    }

    public String getPay_AmountDetail() {
        return pay_AmountDetail;
    }

    public void setPay_AmountDetail(String pay_AmountDetail) {
        this.pay_AmountDetail = pay_AmountDetail;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
