package com.kaiyuan.dfb.mobilecenter.commons.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liuming@che001.com on 2016/9/8.
 */
public class EqualVersionUtil {
    private static final Logger logger = LoggerFactory.getLogger(EqualVersionUtil.class);

    /**
     * 对比使用版本与最新版本
     * 使用版本大于等于最新版本，返回1
     * 使用版本小于最新版本，返回0
     * 使用版本的长度格式不符合要求，返回2
     */
    public static int equalVersionNumber(String userVersion, String newVersion) {
        int flag = 1;
        String userVersionArray[] = userVersion.split("\\.");
        String newVersionArray[] = newVersion.split("\\.");
        if (userVersionArray.length != newVersionArray.length) {
            logger.error("###使用版本长度与最新版本长度不匹配");
            flag = 2;
            return flag;
        }
        for (int i = 0; i < userVersionArray.length; i++) {
            if (!newVersionArray[i].equals(userVersionArray[i])) {
                try {
                    if (Integer.parseInt(userVersionArray[i]) < Integer.parseInt(newVersionArray[i])) {
                        flag = 0;
                    }
                } catch (Exception e) {
                    logger.error("###使用版本类型与最新版本类型不匹配,版本号中含有非数字字符", e);
                    flag = 2;
                }
                break;
            }
        }
        return flag;
    }
}
