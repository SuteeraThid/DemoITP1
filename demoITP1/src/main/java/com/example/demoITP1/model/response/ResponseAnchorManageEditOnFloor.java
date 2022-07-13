package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.AnchorList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseAnchorManageEditOnFloor extends ResponseCommon{
    @JsonProperty("anchorList")
    private List<AnchorList> anchorList;

    public List<AnchorList> getAnchorList() {
        return anchorList;
    }

    public void setAnchorList(List<AnchorList> anchorList) {
        this.anchorList = anchorList;
    }

    @Override
    public String toString() {
        return "ResponseAnchorManageEditOnFloor{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "anchorList=" + anchorList +
                '}';
    }
}
