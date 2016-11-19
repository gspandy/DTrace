package com.kaiyuan.dfb.mobilecenter.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author yangzhibin@che001.com
 * @date 2016/8/2
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDO implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
