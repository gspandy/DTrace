package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.Date;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/24
 */
public class StoreCommentVo extends BaseDO {
    private String content;
    private int mark;
    private boolean isAnonymous;
    private String tags; //tag1,tag2,tag3
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createTime;
    private String criticUserName;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCriticUserName() {
        return criticUserName;
    }

    public void setCriticUserName(String criticUserName) {
        this.criticUserName = criticUserName;
    }
}
