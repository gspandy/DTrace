package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.math.BigDecimal;
import java.util.List;

/**
 * 账户和授信额度接口
 *
 * @author yangzhibin@che001.com
 * @date 2016/8/8
 */
public class AccountAndCreditLineVO extends BaseDO {

    /**
     * 是否授信
     * true-授信
     * false-未授信
     */
    private boolean credit;

    /**
     * 授信额度
     */
    private String creditLine;

    /**
     * 账户信息
     */
    private List<AccountVO> accounts;

    /**
     * 升级数据信息
     */
    private VersionUpVO versionUpData;

    public boolean isCredit() {
        return credit;
    }

    public VersionUpVO getVersionUpData() {
        return versionUpData;
    }

    public void setVersionUpData(VersionUpVO versionUpData) {
        this.versionUpData = versionUpData;
    }

    public String getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(String creditLine) {
        this.creditLine = creditLine;
    }

    public List<AccountVO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountVO> accounts) {
        this.accounts = accounts;
    }

    public boolean getCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }
}
