package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.MessagePo;

import java.util.List;

/**
 * Created by liuming on 2016/8/12.
 * 查询过滤系统消息返回
 */
public class MessageVO extends BaseDO {
    private List<MessagePo> messageData;
    private Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<MessagePo> getMessageData() {
        return messageData;
    }

    public void setMessageData(List<MessagePo> messageData) {
        this.messageData = messageData;
    }
}
