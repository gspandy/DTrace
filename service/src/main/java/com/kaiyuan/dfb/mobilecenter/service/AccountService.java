package com.kaiyuan.dfb.mobilecenter.service;

import com.kaiyuan.dfb.mobilecenter.commons.annotation.Trace;
import java.util.List;

/**
 * 账务service
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/31
 */
public interface AccountService {

    /**
     * 根据用户id获取账户信息
     *
     * @param userId
     * @return
     */
    @Trace(spanId = "查询账户")
    List<String> getAccountByUserId(String userId);


}
