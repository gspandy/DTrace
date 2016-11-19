package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK创建交易参数
 * @author yangzhibin@che001.com
 * @date 2016/9/5
 */
public class SDKCreateTxParamVO extends BaseDO{


    /**
     * 付款方SsoId
     */
    private String srcSsoId;

    /**
     * 收款方SsoId
     */
    private String destSsoId;

    /**
     * 下单金额
     */
    private String amount;

    /**
     * 商户业务平台订单号
     */
    private String requestId;

    /**
     * 商户业务平台订单描述
     */
    private String description;

    /**
     * 商户业务平台订单描述（最好传，交易列表展示需要）
     */
    private String note;

    /**
     * YHC(电商)/ CKK（物流）/ESHOP
     * 产品类型
     */
    private String productType;

    /**
     * 回调URL（由业务方提供）
     */
    private String returnUrl;


    public String getSrcSsoId() {
        return srcSsoId;
    }

    public void setSrcSsoId(String srcSsoId) {
        this.srcSsoId = srcSsoId;
    }

    public String getDestSsoId() {
        return destSsoId;
    }

    public void setDestSsoId(String destSsoId) {
        this.destSsoId = destSsoId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
