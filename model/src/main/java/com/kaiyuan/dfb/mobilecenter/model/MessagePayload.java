package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * Created by liuming@che001.com on 2016/7/22.
 * MessagePo 的子文档
 */
public class MessagePayload extends BaseDO{

    private String body;
    private String subject;

    public MessagePayload(String subject) {
        this.subject = subject;
    }

    public MessagePayload() {

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
