package com.kaiyuan.dfb.mobilecenter.model.vo;

import com.kaiyuan.dfb.mobilecenter.base.BaseDO;
import java.util.Date;

/**
 * Created by a on 2016/8/1.
 * Feedback 查询参数
 */
public class FeedbackParamsVO extends BaseDO {
    public static final Integer DEFAULT_SIZE = 15;
    public static final Integer DEFAULT_FROM = 0;
    private String channel;         //渠道
    private String productVersion;  //版本号
    private String content;         //反馈内容
    private Date startTime;       //开始时间
    private Date endTime;         //结束时间
    private String phone;           //账号
    private Integer from;            //数据位置
    private Integer size;            //每页的数据数量

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
