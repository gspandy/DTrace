package com.kaiyuan.dfb.mobilecenter.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 完善企业信息
 *
 * @author 170014
 */
@Document(collection = "StoreDescription")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreDescription extends Store {

    private static final long serialVersionUID = 3879758640858151975L;

    private String businessTime;
    private String otherInfo;

    public StoreDescription() {
    }

    public StoreDescription(StoreDescription description) {
        this.businessTime = description.getBusinessTime();
        this.otherInfo = description.getOtherInfo();
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }


}
