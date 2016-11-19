package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * 调用交易接口返回的对应实体类
 *
 * @author yangzhibin@che001.com
 * @date 2016/9/14
 */
public class TxDetailDO extends BaseDO {

    /**
     * 交易记录id
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
     * 收款方userId
     */
    private String dest;

    /**
     * 操作方userId
     */
    private String operator;

    /**
     * 发起方(payer,receiver)
     */
    private String initiatedBy;

    /**
     * 用户备注
     */
    private String description;

    /**
     * otp次数
     */
    private String otpCount;

    /**
     * 完成时间
     */
    private String endTime;

    /**
     * 资金类型:af 可用余额 ,cga 信用保证金,cf 现金账户,bf 奖励账户
     */
    private String fundType;


    /**
     * 产品类型 dfb 垫付宝 qyd 轻易贷 yhc 一号车电商 ckk 车快快物流 eshop 乒乒网 jmd 加盟店  ---备注仅做参考
     */
    private String productType;

    /**
     * 交易类型
     */
    private String type;

    /**
     * 交易状态
     * INITIALIZED 初始化
     * PENDING 待付款
     * CANCELLED 已取消
     * COMPLETED 已完成
     * REFUNDING 待退款
     * REFUNDED 已退款
     */
    private String status;

    /**
     * 付款方姓名
     */
    private String nameOfMainSrc;

    /**
     * 收款方姓名
     */
    private String nameOfMainDest;

    /**
     * 付款方姓名
     */
    private String nameOfSrc;

    /**
     * 收款方姓名
     */
    private String nameOfDest;

    /**
     * 付款方电话
     */
    private String phoneOfPayer;

    /**
     * 收款方电话
     */
    private String phoneOfReceiver;

    /**
     * 第三方支付类型    DEFAULT  默认 ，HEE汇付宝，YSP银盛科技
     */
    private String thirdPayType;

    /**
     * 操作人
     */
    private String myOperator;

    /**
     * 对手方姓名
     */
    private String oppositeMainName;

    /**
     * 对手方信息
     */
    private String oppositeMessage;

    /**
     * 金额  带符号(+收入,-支出)
     */
    private String signedAmount;

    /**
     * 类型-描述
     */
    private String typeDetail;

    /**
     * 系统备注
     */
    private String note;

    /**
     * 交易金额
     */
    private String amount;

    /**
     * 交易金额
     */
    private String totalAmount;

    /**
     * 服务费
     */
    private String feeAmount;

    /**
     * 交易金额 (扣除手续费)
     */
    private String finalAmount;

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

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
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

    public String getNameOfMainSrc() {
        return nameOfMainSrc;
    }

    public void setNameOfMainSrc(String nameOfMainSrc) {
        this.nameOfMainSrc = nameOfMainSrc;
    }

    public String getNameOfMainDest() {
        return nameOfMainDest;
    }

    public void setNameOfMainDest(String nameOfMainDest) {
        this.nameOfMainDest = nameOfMainDest;
    }

    public String getNameOfSrc() {
        return nameOfSrc;
    }

    public void setNameOfSrc(String nameOfSrc) {
        this.nameOfSrc = nameOfSrc;
    }

    public String getNameOfDest() {
        return nameOfDest;
    }

    public void setNameOfDest(String nameOfDest) {
        this.nameOfDest = nameOfDest;
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

    public String getThirdPayType() {
        return thirdPayType;
    }

    public void setThirdPayType(String thirdPayType) {
        this.thirdPayType = thirdPayType;
    }

    public String getMyOperator() {
        return myOperator;
    }

    public void setMyOperator(String myOperator) {
        this.myOperator = myOperator;
    }

    public String getOppositeMainName() {
        return oppositeMainName;
    }

    public void setOppositeMainName(String oppositeMainName) {
        this.oppositeMainName = oppositeMainName;
    }

    public String getOppositeMessage() {
        return oppositeMessage;
    }

    public void setOppositeMessage(String oppositeMessage) {
        this.oppositeMessage = oppositeMessage;
    }

    public String getSignedAmount() {
        return signedAmount;
    }

    public void setSignedAmount(String signedAmount) {
        this.signedAmount = signedAmount;
    }

    public String getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }
}
