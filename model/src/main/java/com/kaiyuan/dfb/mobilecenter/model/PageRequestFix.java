package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/8/10
 */
public class PageRequestFix extends BaseDO {
    private final int page;
    private final int size;
    private final String sort;

    public PageRequestFix() {
        this(0, 10);
    }

    public PageRequestFix(int page, int size) {
        this(page, size, null);
    }

    public PageRequestFix(int page, int size, String properties) {
        this.page = page;
        this.size = size;
        this.sort = properties;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public String getSort() {
        return sort;
    }
}
