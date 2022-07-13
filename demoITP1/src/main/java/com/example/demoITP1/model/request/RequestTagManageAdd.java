package com.example.demoITP1.model.request;

import com.example.demoITP1.model.list.NormalRateList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.PrivateKey;
import java.util.List;

public class RequestTagManageAdd extends RequestCommon{
    @JsonProperty("tagID")
    private String tagID;
    @JsonProperty("tagNameLable")
    private String tagNameLable;
    @JsonProperty("floorName")
    private String floorName;
    @JsonProperty("tagColor")
    private String tagColor;
    @JsonProperty("normalRateList")
    private List<NormalRateList> normalRateList;

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getTagNameLable() {
        return tagNameLable;
    }

    public void setTagNameLable(String tagNameLable) {
        this.tagNameLable = tagNameLable;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor;
    }

    public List<NormalRateList> getNormalRateList() {
        return normalRateList;
    }

    public void setNormalRateList(List<NormalRateList> normalRateList) {
        this.normalRateList = normalRateList;
    }

    @Override
    public String toString() {
        return "RequestTagManageAdd{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "tagID='" + tagID + '\'' +
                ", tagNameLable='" + tagNameLable + '\'' +
                ", floorName='" + floorName + '\'' +
                ", tagColor='" + tagColor + '\'' +
                ", normalRateList=" + normalRateList +
                '}';
    }
}
