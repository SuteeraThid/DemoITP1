package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestAnchorManageAddOnFloor extends RequestCommon{
   @JsonProperty("anchorPic")
    private String anchorPic;

    public String getAnchorPic() {
        return anchorPic;
    }

    public void setAnchorPic(String anchorPic) {
        this.anchorPic = anchorPic;
    }

    @Override
    public String toString() {
        return "RequestAnchorManageAddOnFloor{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "anchorPic='" + anchorPic + '\'' +
                '}';
    }
}
