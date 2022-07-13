package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class AnchorList {
    @JsonProperty("anchorID")
    private String anchorID;
    @JsonProperty("anchorNameLable")
    private String anchorNameLable;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("anchorDateCreated")
    private LocalDateTime anchorDateCreated;
    @JsonProperty("anchorPic")
    private String anchorPic;
    @JsonProperty("anchorPointX")
    private int anchorPointX;
    @JsonProperty("anchorPointY")
    private int anchorPointY;
    @JsonProperty("anchorAllQuantity")
    private int anchorAllQuantity;

    // Constructor anchorManageList
    public AnchorList(String anchorID, String anchorNameLable, LocalDateTime anchorDateCreated, int anchorAllQuantity) {
        this.anchorID = anchorID;
        this.anchorNameLable = anchorNameLable;
        this.anchorDateCreated = anchorDateCreated;
        this.anchorAllQuantity = anchorAllQuantity;
    }

    // Constructor anchorManageAdd anchorManageEdit
    public AnchorList(String anchorID, String anchorNameLable) {
        this.anchorID = anchorID;
        this.anchorNameLable = anchorNameLable;
    }


    // Constructor anchorManageAddOnFloor anchorManageEditOnFloor
    public AnchorList(String anchorPic, int anchorPointX, int anchorPointY) {
        this.anchorPic = anchorPic;
        this.anchorPointX = anchorPointX;
        this.anchorPointY = anchorPointY;
    }

    public String getAnchorID() {
        return anchorID;
    }

    public void setAnchorID(String anchorID) {
        this.anchorID = anchorID;
    }

    public String getAnchorNameLable() {
        return anchorNameLable;
    }

    public void setAnchorNameLable(String anchorNameLable) {
        this.anchorNameLable = anchorNameLable;
    }

    public LocalDateTime getAnchorDateCreated() {
        return anchorDateCreated;
    }

    public void setAnchorDateCreated(LocalDateTime anchorDateCreated) {
        this.anchorDateCreated = anchorDateCreated;
    }

    public String getAnchorPic() {
        return anchorPic;
    }

    public void setAnchorPic(String anchorPic) {
        this.anchorPic = anchorPic;
    }

    public int getAnchorPointX() {
        return anchorPointX;
    }

    public void setAnchorPointX(int anchorPointX) {
        this.anchorPointX = anchorPointX;
    }

    public int getAnchorPointY() {
        return anchorPointY;
    }

    public void setAnchorPointY(int anchorPointY) {
        this.anchorPointY = anchorPointY;
    }

    public int getAnchorAllQuantity() {
        return anchorAllQuantity;
    }

    public void setAnchorAllQuantity(int anchorAllQuantity) {
        this.anchorAllQuantity = anchorAllQuantity;
    }

    @Override
    public String toString() {
        return "AnchorList{" +
                "anchorID='" + anchorID + '\'' +
                ", anchorNameLable='" + anchorNameLable + '\'' +
                ", anchorDateCreated=" + anchorDateCreated +
                ", anchorPic='" + anchorPic + '\'' +
                ", anchorPointX=" + anchorPointX +
                ", anchorPointY=" + anchorPointY +
                ", anchorAllQuantity=" + anchorAllQuantity +
                '}';
    }
}
