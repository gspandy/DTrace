package com.kaiyuan.dfb.mobilecenter.model;

import org.bson.types.ObjectId;
import org.springframework.core.annotation.AliasFor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 * 解决Mongo默认Id问题
 * @Author liuxue@che001.com
 * @Date 2016/8/15
 */
@Document(collection = "user")
public class User extends com.kaiyuan.platform.common.model.User {
    @Id
    private ObjectId objectId;

    public ObjectId getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }
}
