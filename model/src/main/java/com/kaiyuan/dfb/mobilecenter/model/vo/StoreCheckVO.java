package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/11/2.
 */
public class StoreCheckVO extends BaseDO {
    private String storeCheckId;
    private String version;

    public String getStoreCheckId() {
        return storeCheckId;
    }

    public void setStoreCheckId(String storeCheckId) {
        this.storeCheckId = storeCheckId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
