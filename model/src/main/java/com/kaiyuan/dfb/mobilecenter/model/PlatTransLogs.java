package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;

/**
 * Created by liuming on 2016/7/19.
 */
public class PlatTransLogs extends BaseDO {

    private String platTransGuid;
    private int status;

    public String getPlatTransGuid() {
        return platTransGuid;
    }

    public void setPlatTransGuid(String platTransGuid) {
        this.platTransGuid = platTransGuid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public PlatTransLogs(String platTransGuid, int status) {
        this.platTransGuid = platTransGuid;
        this.status = status;
    }

    public PlatTransLogs() {
        super();
    }
}

