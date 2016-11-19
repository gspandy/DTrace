package com.kaiyuan.dfb.mobilecenter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;
import com.kaiyuan.platform.common.model.DataEntity;
import com.kaiyuan.platform.common.model.enumeration.EntityType;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by 170182 on 2016/4/26.
 */
@Document(collection = "CommentTags")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTags extends EntityDO {
    private String tagName;
    private String ownerId;
    private String criticId;
    private double mark;

    public CommentTags(CommentTags commentTags) {
        super(commentTags);
        this.tagName = commentTags.getTagName();
        this.ownerId = commentTags.getOwnerId();
        this.criticId = commentTags.getCriticId();
        this.mark = commentTags.getMark();
    }

    public CommentTags(String ownerId) {
        this.ownerId = ownerId;
    }

    public CommentTags() {
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCriticId() {
        return criticId;
    }

    public void setCriticId(String criticId) {
        this.criticId = criticId;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
