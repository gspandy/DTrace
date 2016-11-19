package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.FeedbackDO;

import java.util.List;

/**
 * Created by a on 2016/8/4.
 * 封装了查询数量与查询FeedbackDO信息
 */
public class FeedbackVO extends BaseDO {
    private List<FeedbackDO> feedbackData;
    private Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<FeedbackDO> getFeedbackData() {
        return feedbackData;
    }

    public void setFeedbackData(List<FeedbackDO> feedbackData) {
        this.feedbackData = feedbackData;
    }
}
