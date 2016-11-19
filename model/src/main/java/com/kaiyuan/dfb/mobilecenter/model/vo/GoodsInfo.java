package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import com.kaiyuan.platform.dfb_transaction.model.pay.MobileInfo;

import java.util.List;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/9
 */
public class GoodsInfo extends BaseDO {
    public MobileInfo mobileInfo;
    public List<GoodsVo> goods;

    public GoodsInfo() {
    }

    public GoodsInfo(List<GoodsVo> goods, MobileInfo mobileInfo) {
        this.goods = goods;
        this.mobileInfo = mobileInfo;
    }
}
