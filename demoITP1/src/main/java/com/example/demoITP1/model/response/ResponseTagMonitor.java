package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.FloorList;
import com.example.demoITP1.model.list.FloorListList;
import com.example.demoITP1.model.list.TagList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseTagMonitor extends ResponseCommon {
    @JsonProperty("rcImg")
    private String rcImg;
    @JsonProperty("tagList")
    private List<TagList> tagList;
    @JsonProperty("floorListList")
    private List<FloorListList> floorListList;

    public String getRcImg() {
        return rcImg;
    }

    public void setRcImg(String rcImg) {
        this.rcImg = rcImg;
    }

    public List<TagList> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagList> tagList) {
        this.tagList = tagList;
    }

    public List<FloorListList> getFloorListList() {
        return floorListList;
    }

    public void setFloorListList(List<FloorListList> floorListList) {
        this.floorListList = floorListList;
    }

    @Override
    public String toString() {
        return "ResponseTagMonitor{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "rcImg='" + rcImg + '\'' +
                ", tagList=" + tagList +
                ", floorListList=" + floorListList +
                '}';
    }
}
