package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class FloorList {
    @JsonProperty("floorName")
    private String floorName;
    @JsonProperty("floorPicture")
    private String floorPicture;
    @JsonProperty("floorcoordinateX")
    private Integer floorcoordinateX;
    @JsonProperty("floorcoordinateY")
    private Integer floorcoordinateY;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("floorDateCreated")
    private LocalDateTime floorDateCreated;
    @JsonProperty("floorWidth")
    private Integer floorWidth;
    @JsonProperty("floorHeight")
    private Integer floorHeight;
    @JsonProperty("floorQuantity")
    private Integer floorQuantity;

    // Constructure for tagMonitor and tagHistory anchorManageAdd
    public FloorList(String floorName, String floorPicture, Integer floorcoordinateX, Integer floorcoordinateY) {
        this.floorName = floorName;
        this.floorPicture = floorPicture;
        this.floorcoordinateX = floorcoordinateX;
        this.floorcoordinateY = floorcoordinateY;
    }

    // Constructure for Management
    public FloorList(String floorName, LocalDateTime floorDateCreated, Integer floorQuantity) {
        this.floorName = floorName;
        this.floorDateCreated = floorDateCreated;
        this.floorQuantity = floorQuantity;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getFloorPicture() {
        return floorPicture;
    }

    public void setFloorPicture(String floorPicture) {
        this.floorPicture = floorPicture;
    }

    public Integer getFloorcoordinateX() {
        return floorcoordinateX;
    }

    public void setFloorcoordinateX(Integer floorcoordinateX) {
        this.floorcoordinateX = floorcoordinateX;
    }

    public Integer getFloorcoordinateY() {
        return floorcoordinateY;
    }

    public void setFloorcoordinateY(Integer floorcoordinateY) {
        this.floorcoordinateY = floorcoordinateY;
    }

    public LocalDateTime getFloorDateCreated() {
        return floorDateCreated;
    }

    public void setFloorDateCreated(LocalDateTime floorDateCreated) {
        this.floorDateCreated = floorDateCreated;
    }

    public Integer getFloorWidth() {
        return floorWidth;
    }

    public void setFloorWidth(Integer floorWidth) {
        this.floorWidth = floorWidth;
    }

    public Integer getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Integer floorHeight) {
        this.floorHeight = floorHeight;
    }

    public Integer getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(Integer floorQuantity) {
        this.floorQuantity = floorQuantity;
    }
}
