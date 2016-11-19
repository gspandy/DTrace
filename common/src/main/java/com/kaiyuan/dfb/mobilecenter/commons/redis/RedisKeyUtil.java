package com.kaiyuan.dfb.mobilecenter.commons.redis;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 * <p>redis key 生成工具类</p>
 * @Author yangzhibin@che001.com
 * @Date 2016/4/12
 */
public class RedisKeyUtil {

    /**
     * 生成redis存储的时候的key
     * @see RedisKeyPrex
     * @param prex key前缀,需要从RedisKeyPrex去获取，如果不存在，去RedisKeyPrex里面添加
     * @param key key值
     * @return
     */
    public static String getKey(String prex,String key){
        return prex.concat(key);
    }
}
