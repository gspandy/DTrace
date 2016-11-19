package com.kaiyuan.dfb.mobilecenter.model.ofpay;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/1
 */
public class CardInfo extends BaseDO {
    private String classid; // 所属大类编码
    private String cardid;
    private String cardname; // 小类商品名称
    private String othername;
    private String detail; // 商品介绍
    private String compty; //资费说明
    private String usecity;//开通城市
    private String usemethod; //使用方法
    private String fullcostsite; // 充值网址
    private String proare;//产品产地
    private String serviceNum;//客服服务中心

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCompty() {
        return compty;
    }

    public void setCompty(String compty) {
        this.compty = compty;
    }

    public String getUsecity() {
        return usecity;
    }

    public void setUsecity(String usecity) {
        this.usecity = usecity;
    }

    public String getUsemethod() {
        return usemethod;
    }

    public void setUsemethod(String usemethod) {
        this.usemethod = usemethod;
    }

    public String getFullcostsite() {
        return fullcostsite;
    }

    public void setFullcostsite(String fullcostsite) {
        this.fullcostsite = fullcostsite;
    }

    public String getProare() {
        return proare;
    }

    public void setProare(String proare) {
        this.proare = proare;
    }

    public String getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(String serviceNum) {
        this.serviceNum = serviceNum;
    }
}
