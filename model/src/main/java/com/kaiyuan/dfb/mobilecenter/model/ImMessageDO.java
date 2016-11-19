package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author yangzhibin@che001.com
 * @Date 2016/6/16
 */
@Document(collection = "ImMessage")
@CompoundIndexes({
        @CompoundIndex(name = "fromId_destId", def = "{'fromId' : 1, 'destId': 1}")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImMessageDO extends EntityDO {
    public ImMessageDO() {
    }

    public ImMessageDO(String fromId) {
        this.fromId = fromId;
    }

    public ImMessageDO(TxMessage tx, String opId, ImMessageDO.OpType opType) {
        this(tx);
        this.opId = opId;
        this.opType = opType;
    }

    public enum OpType {
        APPROVE, CREATE, REFUNDING, REFUND, IMAPPROVE
    }

    public ImMessageDO(TxMessage tx) {
        this.setFromId(tx.getSrc());
        this.setFromPhone(tx.getPhoneOfPayer());
        this.setDestId(tx.getDest());
        this.setDestPhone(tx.getPhoneOfReceiver());
        this.setMsgType(ImMessageDO.MsgType.tx);
        this.setUnread(true);
        this.tx = tx;
        this.mark = 1;
    }

    public ImMessageDO newImMessage(TxMessage tx) {
        ImMessageDO imMessage = new ImMessageDO(this);
        imMessage.fromId = this.destId;
        imMessage.fromPhone = this.destPhone;
        imMessage.destId = this.fromId;
        imMessage.destPhone = this.fromPhone;
        imMessage.setMsgType(ImMessageDO.MsgType.tx);
        imMessage.tx = tx;
        return imMessage;
    }

    public ImMessageDO(ImMessageDO imMessage) {
        super(imMessage);
        this.fromId = imMessage.getFromId();
        this.fromPhone = imMessage.getFromPhone();
        this.destId = imMessage.getDestId();
        this.destPhone = imMessage.getDestPhone();
        this.msgType = imMessage.getMsgType();
        this.msgBody = imMessage.getMsgBody();
        this.unread = imMessage.getUnread();
        this.tx = imMessage.getTx();
        this.opId = imMessage.getOpId();
        this.mark = 1;
        this.opType = imMessage.getOpType();
    }

    /**
     * 己方
     */
    @Indexed
    private String fromId;

    private String fromPhone;

    /**
     * 对方
     */
    private String destId;

    private String destPhone;

    /**
     * 消息类型
     */
    private ImMessageDO.MsgType msgType;
    private ImMessageDO.OpType opType;

    private MessageBodyDO msgBody;
    @JsonIgnore
    @Transient
    private TxMessage tx;
    private String opId;

    /**
     * 未读:true
     * 已读:false
     */
    private Boolean unread;
    private Integer mark;

    public enum MsgType {
        text,
        tx,
        voice,
        image,
        custom,;

        MsgType() {
        }

        @JsonValue
        public String toJson() {
            return this.name().toLowerCase();
        }

        @JsonCreator
        public static ImMessageDO.MsgType fromJson(String text) {
            return valueOf(text.toUpperCase());
        }
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String fromPhone) {
        this.fromPhone = fromPhone;
    }

    public String getDestId() {
        return destId;
    }

    public void setDestId(String destId) {
        this.destId = destId;
    }

    public String getDestPhone() {
        return destPhone;
    }

    public void setDestPhone(String destPhone) {
        this.destPhone = destPhone;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    public OpType getOpType() {
        return opType;
    }

    public void setOpType(OpType opType) {
        this.opType = opType;
    }

    public MessageBodyDO getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(MessageBodyDO msgBody) {
        this.msgBody = msgBody;
    }

    public TxMessage getTx() {
        return tx;
    }

    public void setTx(TxMessage tx) {
        this.tx = tx;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
