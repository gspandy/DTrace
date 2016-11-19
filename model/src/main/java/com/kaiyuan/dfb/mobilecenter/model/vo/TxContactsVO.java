package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.model.TxContacts;

import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/8/10
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxContactsVO {
    private long txContactsUnRead;
    private long messageUnRead;
    private long contactsCount;
    private long topCount;
    private long normalCount;
    private String subject;
    private String time;
    private List<TxContacts> txContacts;
    private VersionUpVO versionUpData;

    public TxContactsVO() {
    }

    public long getTxContactsUnRead() {
        return txContactsUnRead;
    }

    public void setTxContactsUnRead(long txContactsUnRead) {
        this.txContactsUnRead = txContactsUnRead;
    }

    public long getMessageUnRead() {
        return messageUnRead;
    }

    public void setMessageUnRead(long messageUnRead) {
        this.messageUnRead = messageUnRead;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<TxContacts> getTxContacts() {
        return txContacts;
    }

    public void setTxContacts(List<TxContacts> txContacts) {
        this.txContacts = txContacts;
    }

    public long getContactsCount() {
        return topCount + normalCount;
    }

    public void setContactsCount(long contactsCount) {
        this.contactsCount = contactsCount;
    }

    public long getTopCount() {
        return topCount;
    }

    public void setTopCount(long topCount) {
        this.topCount = topCount;
    }

    public long getNormalCount() {
        return normalCount;
    }

    public void setNormalCount(long normalCount) {
        this.normalCount = normalCount;
    }

    public VersionUpVO getVersionUpData() {
        return versionUpData;
    }

    public void setVersionUpData(VersionUpVO versionUpData) {
        this.versionUpData = versionUpData;
    }
}
