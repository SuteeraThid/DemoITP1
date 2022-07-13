package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.TagList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseTagCheckbox extends ResponseCommon{
    @JsonProperty("tagList")
    private List<TagList> tagList;
    @JsonProperty("tagFloorQuantity")
    private int tagFloorQuantity;
    @JsonProperty("floorPicture")
    private String floorPicture;
    @JsonProperty("floorName")
    private String floorName;

    public List<TagList> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagList> tagList) {
        this.tagList = tagList;
    }

    public int getTagFloorQuantity() {
        return tagFloorQuantity;
    }

    public void setTagFloorQuantity(int tagFloorQuantity) {
        this.tagFloorQuantity = tagFloorQuantity;
    }

    public String getFloorPicture() {
        return floorPicture;
    }

    public void setFloorPicture(String floorPicture) {
        this.floorPicture = floorPicture;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    @Override
    public String toString() {
        return "ResponseTagCheckbox{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "tagList=" + tagList +
                ", tagFloorQuantity=" + tagFloorQuantity +
                ", floorPicture='" + floorPicture + '\'' +
                ", floorName='" + floorName + '\'' +
                '}';
    }
}
