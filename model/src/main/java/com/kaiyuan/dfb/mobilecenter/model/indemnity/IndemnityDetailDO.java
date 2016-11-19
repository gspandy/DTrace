package com.kaiyuan.dfb.mobilecenter.model.indemnity;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 信用保证金明细vo
 * @author yangzhibin@che001.com
 * @date 2016/10/11
 */
public class IndemnityDetailDO extends BaseDO{

    /**
     * id
     */
    private String id;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 版本
     */
    private String version;

    /**
     * 交易号
     */
    private String number;

    /**
     * 父交易id
     */
    private String parent;

    /**
     * 付款方userId
     */
    private String src;

    /**
     * 付款方账号id
     */
    private String srcAccount;

    /**
     * 付款方卡id
     */
    private String srcCard;

    /**
     * 收款方userId
     */
    private String dest;

    /**
     * receiver account id
     */
    private String destAccount;

    /**
     * receiver card id
     */
    private String destCard;

    /**
     * transaction operator id
     */
    private String operator;

    /**
     * 交易由付款方发起，还是由收款方发起
     */
    private String initiatedBy;

    /**
     * 交易描述
     */
    private String description;

    /**
     * OTP生成次数
     */
    private String otpCount;

    /**
     * transaction end time
     */
    private String endTime;

    private String fundType;

    private String productType;

    /**
     * 交易类型
     */
    private String type;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 收款方进行这笔操作的人的姓名
     */
    private String nameOfDest;

    /**
     * 收款方帐户手机号
     */
    private String phoneOfReceiver;

    /**
     * QYD,DFB区分是轻易贷保证金还是垫付宝保证金
     */
    private String flag;

    /**
     * 交易金额
     */
    private String amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSrcAccount() {
        return srcAccount;
    }

    public void setSrcAccount(String srcAccount) {
        this.srcAccount = srcAccount;
    }

    public String getSrcCard() {
        return srcCard;
    }

    public void setSrcCard(String srcCard) {
        this.srcCard = srcCard;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDestAccount() {
        return destAccount;
    }

    public void setDestAccount(String destAccount) {
        this.destAccount = destAccount;
    }

    public String getDestCard() {
        return destCard;
    }

    public void setDestCard(String destCard) {
        this.destCard = destCard;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtpCount() {
        return otpCount;
    }

    public void setOtpCount(String otpCount) {
        this.otpCount = otpCount;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameOfDest() {
        return nameOfDest;
    }

    public void setNameOfDest(String nameOfDest) {
        this.nameOfDest = nameOfDest;
    }

    public String getPhoneOfReceiver() {
        return phoneOfReceiver;
    }

    public void setPhoneOfReceiver(String phoneOfReceiver) {
        this.phoneOfReceiver = phoneOfReceiver;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
