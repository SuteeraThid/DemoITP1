package com.example.demoITP1.model.request;

import com.example.demoITP1.model.list.NormalRateList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestTagManageEdit extends RequestCommon{
    @JsonProperty("tagID")
    private String tagID;
    @JsonProperty("tagNameLable")
    private String tagNameLable;
    @JsonProperty("floorName")
    private String floorName;
    @JsonProperty("tagColor")
    private String tagColor;
    @JsonProperty("normalRateLists")
    private List<NormalRateList> normalRateLists;

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

    public List<NormalRateList> getNormalRateLists() {
        return normalRateLists;
    }

    public void setNormalRateLists(List<NormalRateList> normalRateLists) {
        this.normalRateLists = normalRateLists;
    }

    @Override
    public String toString() {
        return "RequestTagManageEdit{" +
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
                ", normalRateLists=" + normalRateLists +
                '}';
    }
}
