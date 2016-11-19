package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.Collections;
import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/5
 */
public class PageResult<T> extends BaseDO {
    private final int size;
    private final List<T> list;

    public PageResult() {
        this.size = 0;
        this.list = Collections.EMPTY_LIST;
    }

    public PageResult(int size, List<T> list) {
        this.size = size;
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public List<T> getList() {
        return list;
    }
}
