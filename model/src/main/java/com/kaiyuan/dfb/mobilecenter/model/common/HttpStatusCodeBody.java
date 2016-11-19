package com.kaiyuan.dfb.mobilecenter.model.common;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.List;

/**
 * @author yangzhibin@che001.com
 * @date 2016/9/5
 */
public class HttpStatusCodeBody extends BaseDO {

    private String status;

    private List<CodeMessage> errors;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CodeMessage> getErrors() {
        return errors;
    }

    public void setErrors(List<CodeMessage> errors) {
        this.errors = errors;
    }

    public static class CodeMessage extends BaseDO {
        private String code;

        private String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
