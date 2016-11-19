package com.kaiyuan.dfb.mobilecenter.model.push;

import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/21
 */
@Document(collection = "scanMessage")
public class ScanMessage extends EntityDO {
    @Indexed
    private String scanNumber;
    private String cardNumber;
    private String cardCode;
    private String msgBody;
    private String scanTime;
    private String status;
    @Indexed
    private String userId;
    private String type;

    public ScanMessage() {
    }

    public ScanMessage(ScanMessage scanMessage) {
        super(scanMessage);
        this.scanNumber = scanMessage.getScanNumber();
        this.cardNumber = scanMessage.getCardNumber();
        this.cardCode = scanMessage.getCardCode();
        this.msgBody = scanMessage.getMsgBody();
        this.scanTime = scanMessage.getScanTime();
        this.status = scanMessage.getStatus();
        this.userId = scanMessage.getUserId();
        this.type = scanMessage.getType();
    }

    public String getScanNumber() {
        return scanNumber;
    }

    public void setScanNumber(String scanNumber) {
        this.scanNumber = scanNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
