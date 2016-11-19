package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/10/25
 */
public class StoreEsVo extends BaseDO {
    public String userId;
    public String screenposition;
    public String position;
    public String storeindustry;
    public String storetype;
    public Integer radius;
    public String sort;
    public Integer from;
    public Integer size;

    public StoreEsVo() {
    }

    public StoreEsVo(String userId, String screenposition, String position, String storeindustry, String storetype, Integer radius, String sort, Integer from, Integer size) {
        this.userId = userId;
        this.screenposition = screenposition;
        this.position = position;
        this.storeindustry = storeindustry;
        this.storetype = storetype;
        this.radius = radius;
        this.sort = sort;
        this.from = from;
        this.size = size;
    }
}
