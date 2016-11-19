package com.kaiyuan.dfb.mobilecenter.commons.util;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jiguang.common.resp.DefaultResult;
import cn.jpush.api.JPushClient;
import cn.jpush.api.device.DeviceClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 极光推送
 *
 * @author lein
 */
public class PushUtil {
    private static final Logger logger = LoggerFactory.getLogger(PushUtil.class);

    private final String key;
    private final String secret;
    private final boolean apns;

    public PushUtil(String key, String secret) {
        this(key, secret, false);
    }

    public PushUtil(String key, String secret, boolean apns) {
        this.key = key;
        this.secret = secret;
        this.apns = apns;
    }

    public PushResult push(String userId, String msgBody)
            throws APIConnectionException, APIRequestException {
        return doPush(Platform.all(), Audience.alias(alias(userId)), Message.content(msgBody), null);
    }

    public PushResult push(String userId, Message msg, Notification notify)
            throws APIConnectionException, APIRequestException {
        return doPush(Platform.all(), Audience.alias(alias(userId)), msg, notify);
    }

    public PushResult push(Audience audience, Message msg, Notification notify)
            throws APIConnectionException, APIRequestException {
        return doPush(Platform.all(), audience, msg, notify);
    }

    public PushResult doPush(Platform platform, Audience audience, Message msg, Notification notify)
            throws APIConnectionException, APIRequestException {
        PushPayload.Builder builder = PushPayload.newBuilder()
                .setPlatform(platform).setAudience(audience)
                .setMessage(msg).setOptions(Options.newBuilder().setApnsProduction(apns).build());

        if (notify != null) {
            builder.setNotification(notify);
        }

        JPushClient jpushClient = new JPushClient(secret, key);
        PushPayload payload = builder.build();
        return jpushClient.sendPush(payload);
    }

    public DefaultResult updateDeviceTagAlias(String userId, String deviceId)
            throws APIConnectionException, APIRequestException {
        logger.debug("updateDeviceTagAlias args : {} {}", userId, deviceId);
        DeviceClient deviceClient = new DeviceClient(secret, key);
        deviceClient.deleteAlias(alias(userId), null);
        return deviceClient.updateDeviceTagAlias(deviceId, alias(userId), null, null);
    }

    public DefaultResult deleteAlias(String userId)
            throws APIConnectionException, APIRequestException {
        logger.debug("deleteAlias args : {}", userId);
        DeviceClient deviceClient = new DeviceClient(secret, key);
        return deviceClient.deleteAlias(alias(userId), null);
    }

    private String alias(String userId) {
        return userId.replaceAll("-", "_");
    }
}
