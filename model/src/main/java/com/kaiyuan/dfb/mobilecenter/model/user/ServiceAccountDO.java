package com.kaiyuan.dfb.mobilecenter.model.user;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author yangzhibin@che001.com
 * @date 2016/8/3
 */
@Document(collection = "serviceAccount")
public class ServiceAccountDO extends BaseDO{

    /**
     * 用户id
     */
    private String userId;

    /**
     * 是否授信
     */
    private Boolean initial;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getInitial() {
        return initial;
    }

    public void setInitial(Boolean initial) {
        this.initial = initial;
    }
}
