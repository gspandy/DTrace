package com.kaiyuan.dfb.mobilecenter.commons.exception;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/11
 */
public class ImMessageException extends RuntimeException{
    public ImMessageException() {
        super();
    }

    public ImMessageException(String message) {
        super(message);
    }

    public ImMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImMessageException(Throwable cause) {
        super(cause);
    }

    protected ImMessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
