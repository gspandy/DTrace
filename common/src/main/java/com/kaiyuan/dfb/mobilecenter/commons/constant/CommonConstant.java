package com.kaiyuan.dfb.mobilecenter.commons.constant;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/13
 */
public class CommonConstant {
    public static final String SIGN = "0DE577BC34BF8C9DBECB4899F78832C2";

    /**
     * 未删除
     */
    public static final int LOGICAL_DEL_NOT_DELETED = 0;

    /**
     * 已删除
     */
    public static final int LOGICAL_DEL_DELETED = 1;

    public static final String PARAM_NULL = "必传参数空";
    public static final String PARAM_PATTERN_ERR = "参数格式异常";
    public static final String PARAM_ILLEGAL = "参数非法";
    public static final String PARAM_CONVERT_ERR = "参数转换异常";
    public static final String SERVICE_ERROR = "服务内部错误";
    public static final String CONFLICT = "数据冲突";
    public static final String NOT_FOUND_USER = "没有找到用户";
    public static final String NOT_FOUND = "查询的内容不存在";
    public static final String USER_DISABLE = "用户被禁用";
    public static final String USER_NOT_IMPERFECT_INFO = "用户未完善信息";
    public static final String UNAUTHORIZED = "当前会话失效";
    public static final String SUCCESS = "操作成功";
    public static final String FAIL = "操作失败";
    public static final String NOT_LOGIN = "用户未登录";
    public static final String LOGIN_TIMEOUT = "用户多点登录超时";
    public static final String USER_LOCKED = "登录错误次数过多被锁定";
    //-----------------交易相关的异常------------
    public static final String ERR_SRCUSER_IS_NOT_FOUND = "付款方不存在";
    public static final String ERR_USER_INFO_INCONSISTENT ="用户不一致";
}
