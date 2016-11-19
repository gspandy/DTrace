package com.kaiyuan.dfb.mobilecenter.commons.constant;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/11
 */
public interface ResultCode {

    /**
     * 成功
     */
    Integer SUCCESS_CODE = 10000;

    /**
     * 失败
     */
    Integer FAIL_CODE = 50999;

    /**
     * token失效或者token不存在
     */
    Integer TOKEN_INVALID = 50001;

    /**
     * 未找到
     */
    Integer NOT_FOUND = 50002;
    /**
     * 参数错误
     */
    Integer PARAM_ERROR = 50003;
    /**
     * 数据冲突
     */
    Integer CONFLICT = 50004;

    /**
     * 非法操作
     */
    Integer ILLEGAL_OPERATION = 50005;

    /**
     * 多点登录T人
     */
    Integer LOGOUT_CODE = 50006;

    /**
     * 生成OTP失败
     */
    Integer GENERATE_OTP_FAIL = 50007;

    /**
     * 用户未登录
     */
    Integer NOT_LOGIN = 50008;

    /**
     * 用户被禁用
     */
    Integer USER_DISABLE = 50009;

    /**
     * 用户未完善信息
     */
    Integer USER_NOT_IMPERFECT_INFO = 50010;
    /**
     * 登录用户userId为空
     */
    Integer USER_ID_IS_NULL = 50011;
    /**
     * 多点登录事务超时
     */
    Integer LOGIN_TIMEOUT = 50012;
    /**
     * 登录错误次数过多被锁定
     */
    Integer USER_LOCKED = 50013;
    /**
     * 分期账单还款部分成功
     */
    Integer BILLING_STAGE_PART_SUCCESS = 50014;
    /**
     * 分期账单还款全部失败
     */
    Integer BILLING_STAGE_PART_ERROR = 50015;

    //-----------51开头定义为交易相关的错误
    /**
     * 付款方用户不存在
     */
    Integer PAYER_NOT_FOUND = 51001;

    /**
     * 收款用户不存在
     */
    Integer RECEIVER_NOT_FOUND = 51002;

    /**
     * 付款用户serviceAccount不存在
     */
    Integer PAYER_SERVICEACCOUNT_NOT_FOUND = 51003;

    /**
     * 付款方未实名认证
     */
    Integer PAYER_NOT_REAL_CHECK = 51004;

    /**
     * 付款方账户不存在
     */
    Integer PAYER_ACCOUNT_NOT_FOUND = 51005;

    /**
     * 付款方银行卡不存在
     */
    Integer PAYER_CARD_NOT_FOUND = 51006;

    /**
     * 收款方服务未开通
     */
    Integer ERR_DESTSERVICEACCOUNT_IS_NOT_FOUND = 51007;

    /**
     * 收款方未实名认证
     */
    Integer ERR_SHOPPINGORDER_RECEIVER_WAS_NOT_DONE_REAL_NAME_CHECKED = 51008;

    /**
     * 收款方账户不存在
     */
    Integer ERR_DESTACCOUNT_IS_NOT_FOUND = 51009;

    /**
     * 收款方开元卡不存在
     */
    Integer ERR_DESTCARD_IS_NOT_FOUND = 51010;

    /**
     * 创建交易失败
     */
    Integer ERR_TX_CREATION_FAILED = 51011;

    /**
     * 订单已存在
     */
    Integer ERR_THE_TX_WITH_THE_REQUESTID_HAS_EXIST2 = 51012;

    /**
     * 下单保存订单失败
     */
    Integer ERR_CREATE_TX_IS_NOT_SUCCESS = 51013;

    /**
     * 下单保存回调地址失败
     */
    Integer ERR_CANNOT_TO_SAVE_RETURNURL = 51014;

    /**
     * 服务器内部错误
     */
    Integer INTERNAL_SERVER_ERROR = 51015;

    /**
     * 订单不存在
     */
    Integer ERR_ORDERTX_IS_NOT_FOUND = 51016;

    /**
     * 交易不存在
     */
    Integer ERR_TX_NOT_FOUND = 51017;

    /**
     * 交易状态不是进行中
     */
    Integer ERR_TX_NOT_PENDING_STATE = 51018;

    /**
     * 已经超出otp最大获取次数
     */
    Integer ERR_OTP_MAX_COUNT_EXCEEDED = 51019;

    /**
     * 获取可用otp不存在
     */
    Integer ERR_OTP_GET_AVAILABLE_FAILED = 51020;

    /**
     * OTP获取太频繁
     */
    Integer ERR_OTP_MIN_REFRESH_TIME_NOT_PASSED = 51021;

    /**
     * 更新旧OTP失败
     */
    Integer ERR_OTP_OLD_CANCEL_FAILED = 51022;

    /**
     * 创建OTP失败
     */
    Integer ERR_OTP_CREATION_FAILED = 51023;

    /**
     * 支付订单更新失败
     */
    Integer ERR_TX_UPDATE_FAILED = 51024;
    /**
     * 回调URL不存在
     */
    Integer ERR_RETURNURL_IS_NOT_FOUND = 51025;

    /**
     * 待支付的订单不存在
     */
    Integer ERR_DBPARENTTX_IS_NOT_FOUND = 51026;

    /**
     * 支付方式不合法
     */
    Integer ERR_INVALID_PAY_TYPEDETAIL_LENGTH_ERROR = 51027;

    /**
     * 支付方式不合法，第一个参数必须是AF
     */
    Integer ERR_INVALID_PAY_TYPEDETAIL_0_ERROR = 51028;

    /**
     * 支付方式不合法，第二个参数必须是CF
     */
    Integer ERR_INVALID_PAY_TYPEDETAIL_1_ERROR = 51029;

    /**
     * 支付方式不合法，第三个参数必须是HEE
     */
    Integer ERR_INVALID_PAY_TYPEDETAIL_2_ERROR = 51030;


    /**
     * AF金额为空
     */
    Integer INVALID_GETPAY_AMOUNTDETAIL0_IS_NULL = 51031;

    /**
     * CF金额为空
     */
    Integer INVALID_GETPAY_AMOUNTDETAIL1_IS_NULL = 51032;

    /**
     * HEE金额为空
     */
    Integer INVALID_GETPAY_AMOUNTDETAIL2_IS_NULL = 51033;

    /**
     * 金额不合法
     */
    Integer ERR_INVALID_PAY_AMOUNTDETAIL_0_ERROR = 51034;


    /**
     * 金额不合法
     */
    Integer ERR_INVALID_PAY_AMOUNTDETAIL_1_ERROR = 51035;

    /**
     * 金额不合法
     */
    Integer ERR_INVALID_PAY_AMOUNTDETAIL_2_ERROR = 51036;

    /**
     * 金额不合法
     */
    Integer ERR_KYPAYAMOUNT_OR_HEEPAYAMOUNT_OR_TOTALAMOUNT_IS_NOT_RIGHT = 51037;

    /**
     * 子交易交易金额和与父交易不一致
     */
    Integer ERR_ALL_CHILD_IS_NOT_EQUALS_PARENT = 51038;

    /**
     * OTP为空
     */
    Integer ERR_ORDERPAY_GETOTP_IS_NULL = 51039;

    /**
     * OTP不存在
     */
    Integer ERR_THE_GIVEN_OTP_NOT_FOUND = 51040;

    /**
     * OTP超时
     */
    Integer ERR_OTP_TIME_HAS_BEEN_GONE_30_MINUTES = 51041;

    /**
     * 删除旧网银支付的交易信息未成功
     */
    Integer ERR_TODELETEOLDHEETX_ERROR = 51042;

    /**
     * 支付创建查询历史锁定数据处理失败
     */
    Integer ERR_ORDERPAYCREATE_SETTRANSDETAILWITHOLDNEEDRELEASE_ERROR = 51043;

    /**
     * 创建消费帐户支付的交易信息未成功
     */
    Integer AFAMOUNT_TOCREATENEWTXKYCOMPLETED_ERROR = 51044;

    /**
     * 付款用户状态异常
     */
    Integer PAYER_USER_STATUS_ERR = 51045;
    /**
     * 付款操作 当前登录人不是付款方
     */
    Integer PAYER_USER_NOT_SELF_ERR = 51046;
    /**
     * 收款操作，付款方不能是自己
     */
    Integer PAYER_USER_RECEIVER_SELF_ERR = 51047;

    /**
     * 付款用户serviceAccount.fullName没有
     */
    Integer PAYER_SERVICEACCOUNT_FULL_NAME_NOT_FOUND = 51048;
    /**
     * 付款用户store企业基本信息没有
     */
    Integer PAYER_STORE_NOT_FOUND = 51049;
    /**
     * 付款用户企业名称没有
     */
    Integer PAYER_STORE_NAME_NOT_FOUND = 51050;
    /**
     * 付款用户账户金额或状态异常
     */
    Integer PAYER_ACCOUNT_STATUS_ERR = 51051;
    /**
     * 付款用户账户状态未激活
     */
    Integer PAYER_ACCOUNT_NOT_ACTIVATED = 51052;
    /**
     * 付款用户资金不足
     */
    Integer PAYER_ACCOUNT_AMOUNT_LESS = 51053;
    /**
     * 付款用户AF资金不足
     */
    Integer PAYER_ACCOUNT_AF_AMOUNT_LESS = 51054;
    /**
     * 付款用户CF资金不足
     */
    Integer PAYER_ACCOUNT_CF_AMOUNT_LESS = 51055;
    /**
     * 付款用户轻易贷代扣资金不足
     */
    Integer PAYER_ACCOUNT_QYD_AMOUNT_LESS = 51056;

    /**
     * 付款用户开元卡状态不允许交易
     */
    Integer PAYER_CARD_NOT_ALLOWED = 51057;
    /**
     * 付款操作，安全码不匹配
     */
    Integer PAYER_CARD_CSC_ERR = 51058;

    /**
     * 收款用户状态异常
     */
    Integer RECEIVER_USER_STATUS_ERR = 51059;
    /**
     * 付款操作 收款人不能是自己
     */
    Integer RECEIVER_USER_RECEIVER_SELF_ERR = 51060;
    /**
     * 收款操作 登录人不是收款方
     */
    Integer RECEIVER_USER_RECEIVER_NOT_SELF_ERR = 51061;

    /**
     * 收款用户serviceAccount.fullName没有
     */
    Integer RECEIVER_SERVICEACCOUNT_FULL_NAME_NOT_FOUND = 51062;
    /**
     * 收款用户store企业基本信息没有
     */
    Integer RECEIVER_STORE_NOT_FOUND = 51063;
    /**
     * 收款用户企业名称没有
     */
    Integer RECEIVER_STORE_NAME_NOT_FOUND = 51064;

    /**
     * 收款用户账户金额或状态异常
     */
    Integer RECEIVER_ACCOUNT_STATUS_ERR = 51065;
    /**
     * 收款用户账户状态未激活
     */
    Integer RECEIVER_ACCOUNT_NOT_ACTIVATED = 51066;

    /**
     * 收款用户开元卡状态不允许交易
     */
    Integer RECEIVER_CARD_NOT_ALLOWED = 51067;

    /**
     * 交易订单类型跟当前操作不匹配
     */
    Integer TRANS_ORDER_TYPE_ERR = 51068;
    /**
     * 交易订单状态错误
     */
    Integer TRANS_ORDER_STATUS_ERR = 51069;
    /**
     * 子交易订单为空
     */
    Integer TRANS_ORDER_CHILD_NULL = 51070;
    /**
     * 交易订单金额错误
     */
    Integer TRANS_ORDER_AMOUNT_ERR = 51071;
    /**
     * 用户非法订单操作
     */
    Integer TRANS_ORDER_ILLEGAL_OPERATION = 51072;
    /**
     * 支付分户账参数错误
     */
    Integer TRANS_ORDER_ROYALTY_PARAMET_ERR = 51073;
    /**
     * 支付创建发起用户，跟当前交易初始化用户不一致
     */
    Integer TRANS_ORDER_USER_NOT_LOGGED = 51074;

    /**
     * 账务更新失败
     */
    Integer ERR_PAYER_ACCOUNT_UPDATE_FAILED = 51075;
    /**
     * 开元卡更新失败
     */
    Integer ERR_PAYER_CARD_UPDATE_FAILED = 51076;
    /**
     * 冻结资金创建失败
     */
    Integer ERR_TX_LOCKED_FUND_CREATION_FAILED = 51077;
    /**
     * 订单审核记录创建失败
     */
    Integer ERR_TX_REVIEW_CREATION_FAILED = 51078;

    /**
     * 轻易贷返回余额格式有误
     */
    Integer ERR_TX_QYD_AMOUNT_ERROR = 51079;
    /**
     * 轻易贷余额不足
     */
    Integer ERR_TX_QYD_AMOUNT_LESS_ERROR = 51080;
    /**
     * 当前操作人非法
     */
    Integer APPROVE_LOGGED_USER_ERR = 51081;

    /**
     * 交易动态OTP验证异常
     */
    Integer APPROVE_TX_OTP_PROCESS_ERR = 51082;
    /**
     * 确认交易失败，更新付款账户失败
     */
    Integer APPROVE_ERR_PAYER_ACCOUNT_UPDATE_FAILED = 51083;
    /**
     * 确认交易失败，更新付款开元卡失败
     */
    Integer APPROVE_ERR_PAYER_CARD_UPDATE_FAILED = 51084;
    /**
     * 确认交易失败,更新收款账户失败
     */
    Integer APPROVE_ERR_RECEIVER_ACCOUNT_UPDATE_FAILED = 51085;
    /**
     * 确认交易失败，更新收款开元卡失败
     */
    Integer APPROVE_ERR_RECEIVER_CARD_UPDATE_FAILED = 51086;
    /**
     * 确认交易失败，更新订单 及 锁定资金失败
     */
    Integer APPROVE_ERR_TX_LOCKED_FUND_UPDATE_FAILED = 51087;
    /**
     * 确认交易失败,记录付款方开元卡交易记录失败
     */
    Integer APPROVE_ERR_TX_TRANSFERRED_FUND_PAYER_REGULAR_CREATION_FAILED = 51088;
    /**
     * 确认交易失败，记录收款方开元卡交易记录失败
     */
    Integer APPROVE_ERR_TX_TRANSFERRED_FUND_RECEIVER_REGULAR_CREATION_FAILED = 51089;
    /**
     * 确认交易失败，记录收款方交易佣金流水失败
     */
    Integer APPROVE_ERR_TX_FOR_FEE_CREATION_FAILED = 51090;
    /**
     * 确认交易失败，记录收款方开元卡佣金流水失败
     */
    Integer APPROVE_ERR_TX_TRANSFERRED_FUND_RECEIVER_FEE_CREATION_FAILED = 51091;
    /**
     * 确认交易失败，记录平台卡佣金流水失败
     */
    Integer APPROVE_ERR_TX_TRANSFERRED_FUND_AUTOCHINA_FEE_CREATION_FAILED = 51092;
    /**
     * 确认交易失败，更新交易otp码失败
     */
    Integer APPROVE_ERR_OTP_UPDATE_FAILED = 51093;
    /**
     * 订单更新失败
     */
    Integer APPROVE_ERR_TX_UPDATE_FAILED = 51094;
    /**
     * 违约用户代偿后门-代偿金额异常
     */
    Integer SPECIAL_PATCH_AMT_ERR = 51095;
    /**
     * 违约用户代偿后门-港联账户不匹配
     */
    Integer SPECIAL_PATCH_PHONE_ERR = 51096;
    /**
     * 违约用户代偿后门-用户消费码不存在
     */
    Integer SPECIAL_PATCH_VERIFYCODE_NULL = 51097;
    /**
     * 违约用户代偿后门-填写消费码不匹配
     */
    Integer SPECIAL_PATCH_VERIFYCODE_ERR = 51098;
    /**
     * 违约用户代偿后门-消费码已使用
     */
    Integer SPECIAL_PATCH_VERIFYCODE_USED = 51099;

    /**
     * 轻易贷接口调用出错了
     */
    Integer QYD_API_ERR = 51100;
    /**
     * 轻易贷用户查询接口返回空
     */
    Integer QYD_SEARCHUSERS_NULL = 51101;
    /**
     * 轻易贷用户查询接口返回数量与传入用户个数不一致
     */
    Integer QYD_SEARCHUSERS_NOT_EQUAL = 51102;
    /**
     * 超出接口约定上限
     */
    Integer QYD_UP_LIMIT = 51103;

    /**
     * 港联密匙更新失败
     */
    Integer GANGLIAN_SECRET_UPDATE_ERR = 51104;

    /**
     * 轻易贷代扣失败，本交易已取消，请重新发起交易
     */
    Integer QYD_ORDER_FAILED = 51105;
    /**
     * 交易处理中，请稍后重试
     */
    Integer QYD_ORDER_DOING = 51106;
    /**
     * 系统异常丢失(调用账务系统时，没有errorcode)
     */
    Integer ErrObj = 51107;
    /**
     * 重复记账
     */
    Integer ERR_ACC_DUPLICATE_ACCOUNTING = 51108;
    /**
     * 交易类型错误
     */
    Integer ERR_TX_NOT_PURCHASE = 51109;


    /**
     * 交易记录列表未找到
     */
    Integer ERR_TX_RECORDS_NOT_FOUND = 51110;

    /**
     * 付款方收入额度不足
     */
    Integer PAYER_DOES_NOT_HAVE_ENOUGH_FUNDS_IN_HIS_ACCOUNT = 51111;

    /**
     * 付款方冻结中
     */
    Integer THE_ACCOUNT_FOR_PAYER_IS_FORZEN_OR_DOES_NOT_HAVE_ENOUGH_FUNDS = 51112;

    /**
     * 付款方现金帐户可用金额不足
     */
    Integer DBSRCACCOUNT_GETCASHFUNDS_LESS_THAN_REDUCEAMOUNT = 51113;

    /**
     * 付款方消费帐户冻结金额不足
     */
    Integer SRC_GETLOCKEDAVAILABLEFUNDS_IS_LESS_THAN_OLDNEEDRELEASEAFAMOUNTSUM = 51114;

    /**
     * 付款方现金帐户冻结金额不足
     */
    Integer SRC_GETLOCKEDCASHFUNDS_IS_LESS_THAN_OLDNEEDRELEASECFAMOUNTSUM = 51115;

    /**
     * 收款方冻结收款中，不允许收款
     */
    Integer RECEIVER_ACCOUNT_IS_NOT_ALLOWED_TO_BE_USED_IN_A_TRANSACTION = 51116;

    //银行卡相关的错误
    /**
     * 更新错误
     */
    Integer COMMAND_FAILED = 52001;
    /**
     * 更新时满足条件的记录为0
     */
    Integer ERR_UPDATE_NO_CONTENT = 52002;
    /**
     * 操作不被允许
     * （签约中的银行卡不能删除）
     * （如果存在进行中的银行卡（签约认证中的，不确定成功还是失败），不允许更新）
     */
    Integer OPERATE_NOT_ALLOW = 52003;

    /**
     * 欧飞创建交易异常
     */
    Integer OF_PAY_CREATE_TX = 53001;

    /**
     * 创建订单异常
     */
    Integer CREATE_ORDER_ERROR = 53002;

    /**
     * 查询限额信息失败
     */
    Integer QUERY_QUOTA_ERROR = 53003;

    /**
     * 查询商品信息失败
     */
    Integer QUERY_GOODS_ERROR = 53004;
    /**
     * 查询充值记录失败
     */
    Integer CREATE_OF_PAY_LOG_ERROR = 53005;
}
