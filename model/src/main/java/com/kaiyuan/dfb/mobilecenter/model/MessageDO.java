package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/22
 */
@Document(collection = "message")
public class MessageDO extends EntityDO {

    /**
     * 企业用户存储的是storeId
     * 普通用户存储的是userId
     */
    private String ownerId;

    /**
     * internal--站内信
     */
    private String type;

    /**
     * system--系统消息
     */
    private String contentType;

    private PayLoad payload;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public PayLoad getPayload() {
        return payload;
    }

    public void setPayload(PayLoad payload) {
        this.payload = payload;
    }

    public class PayLoad{
        private String body;

        private String subject;

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
}
