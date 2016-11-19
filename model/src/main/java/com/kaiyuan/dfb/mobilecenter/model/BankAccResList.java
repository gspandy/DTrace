package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;

import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by liuming@che001.com on 2016/10/12.
 * 银行账户查询，返回结果
 */
public class BankAccResList extends BaseDO {
    private List bankAccList;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List getBankAccList() {
        return bankAccList;
    }

    public void setBankAccList(List bankAccList) {
        this.bankAccList = bankAccList;
    }
}
