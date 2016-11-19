package com.kaiyuan.dfb.mobilecenter.commons.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author yangzhibin@che001.com
 * @Date 2016/4/20
 */
public class RWDataSource extends AbstractRoutingDataSource{


    @Override
    protected Object determineCurrentLookupKey() {
        return RWDataSourceHolder.getDataSource();
    }
}
