package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FloorListList {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcCode")
    private String rcCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcName")
    private String rcName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcStatusCode")
    private String rcStatusCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcStatusName")
    private String rcStatusName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcSumVisitor")
    private Long rcSumVisitor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcSumContractor")
    private Long rcSumContractor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcSumAsset")
    private Long rcSumAsset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcPointX")
    private Integer rcPointX;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rcPointY")
    private Integer rcPointY;
    @JsonIgnore
    private String rcImg;

    ////For Monitor
    public FloorListList(String rcCode, String rcName, String rcStatusCode, Integer rcPointX, Integer rcPointY, String rcImg) {
        this.rcCode = rcCode;
        this.rcName = rcName;
        this.rcStatusCode = rcStatusCode;
        this.rcPointX = rcPointX;
        this.rcPointY = rcPointY;
        this.rcImg = rcImg;
    }

    public String getRcCode() {
        return rcCode;
    }

    public void setRcCode(String rcCode) {
        this.rcCode = rcCode;
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName;
    }

    public String getRcStatusCode() {
        return rcStatusCode;
    }

    public void setRcStatusCode(String rcStatusCode) {
        this.rcStatusCode = rcStatusCode;
    }

    public String getRcStatusName() {
        return rcStatusName;
    }

    public void setRcStatusName(String rcStatusName) {
        this.rcStatusName = rcStatusName;
    }

    public Long getRcSumVisitor() {
        return rcSumVisitor;
    }

    public void setRcSumVisitor(Long rcSumVisitor) {
        this.rcSumVisitor = rcSumVisitor;
    }

    public Long getRcSumContractor() {
        return rcSumContractor;
    }

    public void setRcSumContractor(Long rcSumContractor) {
        this.rcSumContractor = rcSumContractor;
    }

    public Long getRcSumAsset() {
        return rcSumAsset;
    }

    public void setRcSumAsset(Long rcSumAsset) {
        this.rcSumAsset = rcSumAsset;
    }

    public Integer getRcPointX() {
        return rcPointX;
    }

    public void setRcPointX(Integer rcPointX) {
        this.rcPointX = rcPointX;
    }

    public Integer getRcPointY() {
        return rcPointY;
    }

    public void setRcPointY(Integer rcPointY) {
        this.rcPointY = rcPointY;
    }

    public String getRcImg() {
        return rcImg;
    }

    public void setRcImg(String rcImg) {
        this.rcImg = rcImg;
    }

    @Override
    public String toString() {
        return "FloorListList{" +
                "rcCode='" + rcCode + '\'' +
                ", rcName='" + rcName + '\'' +
                ", rcStatusCode='" + rcStatusCode + '\'' +
                ", rcStatusName='" + rcStatusName + '\'' +
                ", rcSumVisitor=" + rcSumVisitor +
                ", rcSumContractor=" + rcSumContractor +
                ", rcSumAsset=" + rcSumAsset +
                ", rcPointX=" + rcPointX +
                ", rcPointY=" + rcPointY +
                ", rcImg='" + rcImg + '\'' +
                '}';
    }
}
