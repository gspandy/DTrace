package com.kaiyuan.dfb.mobilecenter.model.indemnity;

import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/10/11
 */
public class IndemnityDetailResultVO {

    /**
     * 数据总数
     */
    private Integer totalNum;

    /**
     * 信用保证金列表
     */
    private List<IndemnityDetailDO> indemnityDetailDOs;

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public List<IndemnityDetailDO> getIndemnityDetailDOs() {
        return indemnityDetailDOs;
    }

    public void setIndemnityDetailDOs(List<IndemnityDetailDO> indemnityDetailDOs) {
        this.indemnityDetailDOs = indemnityDetailDOs;
    }
}
