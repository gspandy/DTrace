package com.kaiyuan.dfb.mobilecenter.model.account;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import java.math.BigDecimal;

/**
 * 账户信息
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/31
 */
public class AccountDO extends BaseDO {

    /**
     * 用户id
     */
    private String userGuid;

    /**
     * 账户类型备注
     */
    private String typeRemark;

    /**
     * 1借(现金户)/ -1贷(信用户)
     */
    private Integer direct;

    /**
     * 系统设定状态，有ACTIVE/FROZEN/CANCEL
     */
    private String status;

    /**
     * 风控设定状态，MANUAL_ACTIVE/MANUAL_FROZEN
     */
    private String manualStatus;

    /**
     * 账户类型
     * CREDIT_REGULAR-个人信用户
     * CREDIT_STORE -企业信用户
     * CREDIT_CHANNEL -渠道信用户
     * CREDIT_INTERNAL -内部信用户
     * CASH_REGULAR -个人现金户
     * CASH_STORE -企业现金户
     * CASH_CHANNEL -渠道现金户
     * CASH_INTERNAL -内部现金户
     */
    private String type;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 授信额度
     */
    private BigDecimal creditLine;

    /**
     * 总的锁定金额
     */
    private BigDecimal lockedFunds;

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark;
    }

    public Integer getDirect() {
        return direct;
    }

    public void setDirect(Integer direct) {
        this.direct = direct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManualStatus() {
        return manualStatus;
    }

    public void setManualStatus(String manualStatus) {
        this.manualStatus = manualStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    public BigDecimal getLockedFunds() {
        return lockedFunds;
    }

    public void setLockedFunds(BigDecimal lockedFunds) {
        this.lockedFunds = lockedFunds;
    }
}
