package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.VersionControl;
import com.kaiyuan.dfb.mobilecenter.model.VersionControlLog;

import java.util.List;

/**
 * Created by a on 2016/8/4.
 * 封装查询数量与查询的 VersionControlLog信息
 */
public class VersionVO extends BaseDO {
    private List<VersionControlLog> versionData;
    private Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<VersionControlLog> getVersionData() {
        return versionData;
    }

    public void setVersionData(List<VersionControlLog> versionData) {
        this.versionData = versionData;
    }
}
