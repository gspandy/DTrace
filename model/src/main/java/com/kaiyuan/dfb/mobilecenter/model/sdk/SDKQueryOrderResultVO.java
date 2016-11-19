package com.kaiyuan.dfb.mobilecenter.model.sdk;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * SDK订单查询返回值
 *
 * @author yangzhibin@che001.com
 * @date 2016/9/5
 */
public class SDKQueryOrderResultVO extends BaseDO {

    /**
     * 商户业务平台订单号
     */
    private String requestID;

    /**
     * 消费帐户收入额度
     */
    private String income_amount;

    /**
     * 消费帐户可用额度
     */
    private String af_amount;

    /**
     * 消费帐户信用额度
     */
    private String cl_amount;

    /**
     * 现金帐户额度
     */
    private String cf_amount;

    /**
     * 支付方AF,CF是否冻结付款
     */
    private String payerIsFrozenPay;

    /**
     * 支付渠道（电商或物流）
     * INCOME@false,CF@false,HEE_QY@true(物流电商正常)"或"AF@false,CF@false(物流正常)
     */
    private String payChannel;

    /**
     * 付款方主账户姓名
     */
    private String nameOfMainSrc;

    /**
     * 收款方主账户姓名
     */
    private String nameOfDest;

    /**
     * 付款方userId
     */
    private String src;

    /**
     * 收款方userId
     */
    private String dest;

    /**
     * 订单交易版本号
     */
    private String version;

    /**
     * 付款方账户手机号
     */
    private String phoneOfPayer;

    /**
     * 收款方账户手机号
     */
    private String phoneOfReceiver;

    /**
     * 还需要支付的金额
     */
    private String needPayAmount;

    /**
     * 生成OTP次数
     */
    private String otpCount;

    /**
     * 订单支付详情
     */
    private OrderPayDetail orderPayDetail;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getIncome_amount() {
        return income_amount;
    }

    public void setIncome_amount(String income_amount) {
        this.income_amount = income_amount;
    }

    public String getAf_amount() {
        return af_amount;
    }

    public void setAf_amount(String af_amount) {
        this.af_amount = af_amount;
    }

    public String getCl_amount() {
        return cl_amount;
    }

    public void setCl_amount(String cl_amount) {
        this.cl_amount = cl_amount;
    }

    public String getCf_amount() {
        return cf_amount;
    }

    public void setCf_amount(String cf_amount) {
        this.cf_amount = cf_amount;
    }

    public String getPayerIsFrozenPay() {
        return payerIsFrozenPay;
    }

    public void setPayerIsFrozenPay(String payerIsFrozenPay) {
        this.payerIsFrozenPay = payerIsFrozenPay;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getNameOfMainSrc() {
        return nameOfMainSrc;
    }

    public void setNameOfMainSrc(String nameOfMainSrc) {
        this.nameOfMainSrc = nameOfMainSrc;
    }

    public String getNameOfDest() {
        return nameOfDest;
    }

    public void setNameOfDest(String nameOfDest) {
        this.nameOfDest = nameOfDest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPhoneOfPayer() {
        return phoneOfPayer;
    }

    public void setPhoneOfPayer(String phoneOfPayer) {
        this.phoneOfPayer = phoneOfPayer;
    }

    public String getPhoneOfReceiver() {
        return phoneOfReceiver;
    }

    public void setPhoneOfReceiver(String phoneOfReceiver) {
        this.phoneOfReceiver = phoneOfReceiver;
    }

    public String getNeedPayAmount() {
        return needPayAmount;
    }

    public void setNeedPayAmount(String needPayAmount) {
        this.needPayAmount = needPayAmount;
    }

    public String getOtpCount() {
        return otpCount;
    }

    public void setOtpCount(String otpCount) {
        this.otpCount = otpCount;
    }

    public OrderPayDetail getOrderPayDetail() {
        return orderPayDetail;
    }

    public void setOrderPayDetail(OrderPayDetail orderPayDetail) {
        this.orderPayDetail = orderPayDetail;
    }

    /**
     * 订单付款详情
     */
    public static class OrderPayDetail extends BaseDO{

        /**
         * 订单父交易的信息汇总
         */
        private Tx parentTx;

        /**
         * 消费帐户支付的交易信息汇总
         */
        private TxAmount afTx;

        /**
         * 现金帐户支付的交易信息汇总
         */
        private TxAmount cfTx;

        /**
         * 汇付宝支付的交易信息汇总
         */
        private Tx heeTx;

        public Tx getParentTx() {
            return parentTx;
        }

        public void setParentTx(Tx parentTx) {
            this.parentTx = parentTx;
        }

        public TxAmount getAfTx() {
            return afTx;
        }

        public void setAfTx(TxAmount afTx) {
            this.afTx = afTx;
        }

        public TxAmount getCfTx() {
            return cfTx;
        }

        public void setCfTx(TxAmount cfTx) {
            this.cfTx = cfTx;
        }

        public Tx getHeeTx() {
            return heeTx;
        }

        public void setHeeTx(Tx heeTx) {
            this.heeTx = heeTx;
        }
    }

    /**
     * 交易
     */
    public static class Tx extends BaseDO{

        /**
         * id
         */
        private String id;

        /**
         * 金额
         */
        private String amount;

        /**
         * 状态
         */
        private String status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    /**
     * 交易金额
     */
    public static class TxAmount extends BaseDO{
        /**
         * 金额
         */
        private String amount;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }



}
