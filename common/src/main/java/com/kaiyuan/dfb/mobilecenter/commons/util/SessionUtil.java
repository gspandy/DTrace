package com.kaiyuan.dfb.mobilecenter.commons.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * Session工具类
 * @author yangzhibin@che001.com
 * @date 2016/7/12
 */
public class SessionUtil {

    private static final Logger logger = LoggerFactory.getLogger(SessionUtil.class);

    /**
     * SHA-256编码
     * @param token
     * @return
     */
    private static String sha256Of(String token) {
        if (StringUtils.isEmpty(token)) {
            logger.error("###token={}为空###", token);
            return null;
        } else {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(token.getBytes("UTF-8"));
                byte[] e = md.digest();
                return Base64.encodeBase64String(e);
            } catch (Exception e) {
                logger.error("###Could not calculate hash###", e);
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 根据token生成session在redis中的key
     * @param token
     * @return
     */
    public static String sessionKey(String token){
        return "session:"+sha256Of(token);
    }

    public static void main(String[] args) {
        String s=sessionKey("2Fm3q7TH2bjOVdVCTLgU7XYhX3Tv2kK96jJkXp9JmFkn3JURod6XXqBvhDR34VfGaGuMC");
        System.out.println("s="+s);
    }
}
