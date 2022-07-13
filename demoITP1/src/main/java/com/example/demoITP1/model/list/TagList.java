package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public class TagList {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagID")
    private String tagID;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagNameLable")
    private String tagNameLable;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagProfileImage")
    private String tagProfileImage;     // เป็น path
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagColor")
    private String tagColor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagPointX")
    private Integer tagPointX;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagPointY")
    private Integer tagPointY;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagFloorName")
    private String tagFloorName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("tagDateCreated")
    private LocalDateTime tagDateCreated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagAllQuantity")
    private Integer tagAllQuantity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tagFloorQuantity")
    private Integer tagFloorQuantity;


    //Constructure for Monitor and  History
    public TagList(String tagID, String tagNameLable, String tagProfileImage, Integer tagPointX, Integer tagPointY, Integer tagFloorQuantity) {
        this.tagID = tagID;
        this.tagNameLable = tagNameLable;
        this.tagProfileImage = tagProfileImage;
        this.tagPointX = tagPointX;
        this.tagPointY = tagPointY;
        this.tagFloorQuantity = tagFloorQuantity;
    }

    //Constructure for Management
    public TagList(String tagID, String tagNameLable, String tagProfileImage, String tagFloorName, LocalDateTime tagDateCreated, Integer tagAllQuantity) {
        this.tagID = tagID;
        this.tagNameLable = tagNameLable;
        this.tagProfileImage = tagProfileImage;
        this.tagFloorName = tagFloorName;
        this.tagDateCreated = tagDateCreated;
        this.tagAllQuantity = tagAllQuantity;
    }

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

    public String getTagProfileImage() {
        return tagProfileImage;
    }

    public void setTagProfileImage(String tagProfileImage) {
        this.tagProfileImage = tagProfileImage;
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor;
    }

    public Integer getTagPointX() {
        return tagPointX;
    }

    public void setTagPointX(Integer tagPointX) {
        this.tagPointX = tagPointX;
    }

    public Integer getTagPointY() {
        return tagPointY;
    }

    public void setTagPointY(Integer tagPointY) {
        this.tagPointY = tagPointY;
    }

    public String getTagFloorName() {
        return tagFloorName;
    }

    public void setTagFloorName(String tagFloorName) {
        this.tagFloorName = tagFloorName;
    }

    public LocalDateTime getTagDateCreated() {
        return tagDateCreated;
    }

    public void setTagDateCreated(LocalDateTime tagDateCreated) {
        this.tagDateCreated = tagDateCreated;
    }

    public Integer getTagAllQuantity() {
        return tagAllQuantity;
    }

    public void setTagAllQuantity(Integer tagAllQuantity) {
        this.tagAllQuantity = tagAllQuantity;
    }

    public Integer getTagFloorQuantity() {
        return tagFloorQuantity;
    }

    public void setTagFloorQuantity(Integer tagFloorQuantity) {
        this.tagFloorQuantity = tagFloorQuantity;
    }

    @Override
    public String toString() {
        return "TagList{" +
                "tagID='" + tagID + '\'' +
                ", tagNameLable='" + tagNameLable + '\'' +
                ", tagProfileImage='" + tagProfileImage + '\'' +
                ", tagColor='" + tagColor + '\'' +
                ", tagPointX=" + tagPointX +
                ", tagPointY=" + tagPointY +
                ", tagFloorName='" + tagFloorName + '\'' +
                ", tagDateCreated=" + tagDateCreated +
                ", tagAllQuantity=" + tagAllQuantity +
                ", tagFloorQuantity=" + tagFloorQuantity +
                '}';
    }
}