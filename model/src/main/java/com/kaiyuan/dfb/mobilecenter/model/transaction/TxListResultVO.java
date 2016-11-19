package com.kaiyuan.dfb.mobilecenter.model.transaction;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.List;

/**
 * 交易列表返回值
 * @author yangzhibin@che001.com
 * @date 2016/9/14
 */
public class TxListResultVO extends BaseDO{

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 交易列表
     */
    private List<TxVO> txRecords;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TxVO> getTxRecords() {
        return txRecords;
    }

    public void setTxRecords(List<TxVO> txRecords) {
        this.txRecords = txRecords;
    }
}
