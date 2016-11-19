package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/21
 */
public class TagsVo extends BaseDO {
    public String tagName;
    public Integer mark;

    public TagsVo(String tagName, Integer mark) {
        this.tagName = tagName;
        this.mark = mark;
    }
}
