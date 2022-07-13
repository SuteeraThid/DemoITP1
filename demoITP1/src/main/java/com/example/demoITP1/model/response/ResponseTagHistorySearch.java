package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.FloorList;
import com.example.demoITP1.model.list.TagList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseTagHistorySearch extends ResponseCommon{
    @JsonProperty("tagList")
    private List<TagList> tagList;
    @JsonProperty("floorList")
    private List<FloorList> floorList;

    public List<TagList> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagList> tagList) {
        this.tagList = tagList;
    }

    public List<FloorList> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<FloorList> floorList) {
        this.floorList = floorList;
    }

    @Override
    public String toString() {
        return "ResponseTagHistorySearch{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "tagList=" + tagList +
                ", floorList=" + floorList +
                '}';
    }
}
