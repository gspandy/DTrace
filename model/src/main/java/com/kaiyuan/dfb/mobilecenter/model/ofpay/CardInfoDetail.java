package com.kaiyuan.dfb.mobilecenter.model.ofpay;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/11/1
 */
public class CardInfoDetail extends BaseDO {
    private String cardid;
    private String pervalue; //标签价
    private String inprice; //供货价
    private String innum;//可用数量
    private String cardname;//商品信息
    private String othername;
    private String amounts;//在线充产品可选数量，连续的用“-”表示，“,”用作分隔符
    private String subclassid; //此商品所属子类编码
    private String classtype; // 1-实物商品，2-直充商品，3-卡密商品， 4-手机快冲，5-手机慢冲，6-支付商品
    private String fullcostsite; //充值网址
    private String lastreftime;//最后操作时间
    private String accountdesc;//账号描述

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPervalue() {
        return pervalue;
    }

    public void setPervalue(String pervalue) {
        this.pervalue = pervalue;
    }

    public String getInprice() {
        return inprice;
    }

    public void setInprice(String inprice) {
        this.inprice = inprice;
    }

    public String getInnum() {
        return innum;
    }

    public void setInnum(String innum) {
        this.innum = innum;
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

    public String getAmounts() {
        return amounts;
    }

    public void setAmounts(String amounts) {
        this.amounts = amounts;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public String getFullcostsite() {
        return fullcostsite;
    }

    public void setFullcostsite(String fullcostsite) {
        this.fullcostsite = fullcostsite;
    }

    public String getLastreftime() {
        return lastreftime;
    }

    public void setLastreftime(String lastreftime) {
        this.lastreftime = lastreftime;
    }

    public String getAccountdesc() {
        return accountdesc;
    }

    public void setAccountdesc(String accountdesc) {
        this.accountdesc = accountdesc;
    }
}
