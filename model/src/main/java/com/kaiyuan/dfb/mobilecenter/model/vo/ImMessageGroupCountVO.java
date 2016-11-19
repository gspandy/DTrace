package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/8/5
 */
public class ImMessageGroupCountVO extends BaseDO{
    private String destId;
    private Long mark;

    public ImMessageGroupCountVO(String destId, Long mark) {
        this.destId = destId;
        this.mark = mark;
    }

    public String getDestId() {
        return destId;
    }

    public void setDestId(String destId) {
        this.destId = destId;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ImMessageGroupCountVO{" +
                "destId='" + destId + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
