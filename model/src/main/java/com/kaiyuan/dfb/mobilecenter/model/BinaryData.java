package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/28
 */
public class BinaryData extends BaseDO {
    private String fileName;
    private String mimeType;
    private byte[] data;

    public BinaryData() {
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}