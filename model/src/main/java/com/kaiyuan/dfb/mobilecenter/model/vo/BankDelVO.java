package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/10/10.
 */
public class BankDelVO extends BaseDO {
    private String Status;
    private String version;
    private String bankCardId;

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
