package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/9/14.
 */
public class OtpParamVO extends BaseDO {
    /**
     * 交易ID
     */
    private String transaction;
    /**
     * 渠道(pc,ios,android,wap)
     */
    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
}
