package com.kaiyuan.dfb.mobilecenter.field;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 * 交易消息对应的mongo中的字段
 * @Author yangzhibin@che001.com
 * @Date 2016/6/2
 */
public class ImMessageFields {

    public static final String TABLE = "ImMessage";

    public static final String ID = "id";
    public static final String CREATE_TIME = "createTime";
    public static final String UPDATE_TIME = "updateTime";
    public static final String LOGICAL_DELETE = "logicalDel";
    public static final String VERSION = "version";

    public static final String FROMID = "fromId";
    public static final String FROMPHONE = "fromPhone";
    public static final String DESTID = "destId";
    public static final String DESTPHONE = "destPhone";
    public static final String MSGTYPE = "msgType";
    public static final String MSGBODY = "msgBody";
    public static final String UNREAD = "unread";
    public static final String MARK = "mark";

    public static final String TRANSACTIONID  = "transactionId";
    public static final String SRC  = "src";
    public static final String DEST  = "dest";
    public static final String OPERATOR  = "operator";
    public static final String INITIATEDBY  = "initiatedBy";
    public static final String TXCOMMENT  = "txComment";
    public static final String DESCRIPTION  = "description";
    public static final String STATUS  = "status";
    public static final String AMOUNT  = "amount";
    public static final String FEEAMOUNT  = "feeAmount";
    public static final String FINALAMOUNT  = "finalAmount";
    public static final String NUMBER  = "number";
}
