package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 交易初始化返回值vo
 *
 * @author yangzhibin@che001.com
 * @date 2016/8/9
 */
public class InitTxResultVO extends BaseDO {

    /**
     * 交易初始化消息
     */
    private TxInitInfo txInitInfo;


    /**
     * 付款方消息
     */
    private PayerInfo payerInfo;


    public TxInitInfo getTxInitInfo() {
        return txInitInfo;
    }

    public void setTxInitInfo(TxInitInfo txInitInfo) {
        this.txInitInfo = txInitInfo;
    }

    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(PayerInfo payerInfo) {
        this.payerInfo = payerInfo;
    }

    /**
     * 交易初始化相关信息
     */
    public class TxInitInfo extends BaseDO{

        /**
         * 对方信息（如果direction=in，收款，这里的信息就是交易付款方信息）
         */
        private String sourceCardNo;

        /**
         *
         */
        private String sourceCardHolder;

        private String sourcePhone;

        /**
         * 当前登录用户的手机号，卡号，垫付宝名称
         */
        private String targetPhone;

        /**
         * 当前登录用户的卡号
         */
        private String targetCardNo;

        /**
         * 当前登录用户的垫付宝名称
         */
        private String targetCardHolder;

        private String description;

        private String transactionId;

        private String amount;

        public String getSourceCardNo() {
            return sourceCardNo;
        }

        public void setSourceCardNo(String sourceCardNo) {
            this.sourceCardNo = sourceCardNo;
        }

        public String getSourceCardHolder() {
            return sourceCardHolder;
        }

        public void setSourceCardHolder(String sourceCardHolder) {
            this.sourceCardHolder = sourceCardHolder;
        }

        public String getSourcePhone() {
            return sourcePhone;
        }

        public void setSourcePhone(String sourcePhone) {
            this.sourcePhone = sourcePhone;
        }

        public String getTargetPhone() {
            return targetPhone;
        }

        public void setTargetPhone(String targetPhone) {
            this.targetPhone = targetPhone;
        }

        public String getTargetCardNo() {
            return targetCardNo;
        }

        public void setTargetCardNo(String targetCardNo) {
            this.targetCardNo = targetCardNo;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTargetCardHolder() {
            return targetCardHolder;
        }

        public void setTargetCardHolder(String targetCardHolder) {
            this.targetCardHolder = targetCardHolder;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }

    /**
     * 付款方信息
     */
    public class PayerInfo extends BaseDO{
        private String dfbPhone;

        private String dfbName;

        private Account afAccount;

        private Account cfAccount;

        public String getDfbPhone() {
            return dfbPhone;
        }

        public void setDfbPhone(String dfbPhone) {
            this.dfbPhone = dfbPhone;
        }

        public String getDfbName() {
            return dfbName;
        }

        public void setDfbName(String dfbName) {
            this.dfbName = dfbName;
        }

        public Account getAfAccount() {
            return afAccount;
        }

        public void setAfAccount(Account afAccount) {
            this.afAccount = afAccount;
        }

        public Account getCfAccount() {
            return cfAccount;
        }

        public void setCfAccount(Account cfAccount) {
            this.cfAccount = cfAccount;
        }

        /**
         * 账户信息
         */
        public class Account extends BaseDO{
            /**
             * 状态
             */
            private String status;

            /**
             * 金额
             */
            private String amount;

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
        }

    }
}
