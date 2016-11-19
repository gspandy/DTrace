package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/13
 */
public class MessageBatchOperator extends BaseDO {
    public String id;
    public Operator operation;

    public MessageBatchOperator() {
    }

    public MessageBatchOperator(String id, Operator operation) {
        this.id = id;
        this.operation = operation;
    }

    public enum Operator {
        delete, read, unread, unknown
    }
}
