package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.dfb.mobilecenter.model.CommentTags;
import com.kaiyuan.dfb.mobilecenter.model.StoreComment;
import com.kaiyuan.dfb.mobilecenter.model.StoreDescription;

import java.util.List;

/**
 * Created by Lein on 2016/4/28.
 */
public class StoreCommentDetailVo extends BaseDO {
    private List<TagsVo> tags;
    private List<StoreCommentVo> comments;
    private StoreDescription description;
    private String ownerId;
    private String criticId;
    private int count;
    private String mark;

    public StoreCommentDetailVo() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public StoreDescription getDescription() {
        return description;
    }

    public void setDescription(StoreDescription description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCriticId() {
        return criticId;
    }

    public void setCriticId(String criticId) {
        this.criticId = criticId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<TagsVo> getTags() {
        return tags;
    }

    public void setTags(List<TagsVo> tags) {
        this.tags = tags;
    }

    public List<StoreCommentVo> getComments() {
        return comments;
    }

    public void setComments(List<StoreCommentVo> comments) {
        this.comments = comments;
    }
}
