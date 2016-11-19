package com.kaiyuan.dfb.mobilecenter.commons.exception;

import com.kaiyuan.dfb.mobilecenter.commons.constant.ResultCode;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/7/19
 */
public class CustomException extends RuntimeException {
    private Integer code;

    public CustomException(CustomException ex) {
        super(ex);
        this.code = ex.getCode();
    }

    public CustomException(String message) {
        this(ResultCode.FAIL_CODE, message);
    }

    public CustomException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
