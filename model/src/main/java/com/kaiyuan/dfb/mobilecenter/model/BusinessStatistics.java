package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/5
 */
@Document(collection = "BusinessStatistics")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessStatistics extends EntityDO {
    private String userId;
    private String description;
    private String channel;
    private String businessId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
