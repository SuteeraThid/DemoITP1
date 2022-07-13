package com.example.demoITP1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFloorManageAddFile extends ResponseCommon{
    @JsonProperty("floorPicture")
    private String floorPicture;

    public String getFloorPicture() {
        return floorPicture;
    }

    public void setFloorPicture(String floorPicture) {
        this.floorPicture = floorPicture;
    }

    @Override
    public String toString() {
        return "ResponseFloorManageAddFile{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "floorPicture='" + floorPicture + '\'' +
                '}';
    }
}
