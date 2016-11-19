package com.kaiyuan.dfb.mobilecenter.commons.constant;

import com.kaiyuan.dfb.mobilecenter.commons.util.ZkPropertyUtil;

/**
 * 系统URL
 * @author yangzhibin@che001.com
 * @date 2016/11/2
 */
public class URLConstant {

    public static final String HTTP="http://";

    /**
     * <p>交易系统地址</p>
     * @author yangzhibin@che001.com
     * @date 2016/11/16
     */
    public static final String BANKING= HTTP+ZkPropertyUtil.get("component.banking");

    /**
     * <p>获取轻易贷余额</p>
     * @author yangzhibin@che001.com
     * @date 2016/11/16
     */
    public static final String CASHIER= HTTP+ZkPropertyUtil.get("component.cashier");

    /**
     * <p>后台账户状态接口地址</p>
     * @author yangzhibin@che001.com
     * @date 2016/11/16
     */
    public static final String BACKEND_ACCOUNT_STATUS=ZkPropertyUtil.get("component.backend");

}
