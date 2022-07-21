package com.example.demoITP1.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "floor")
public class FloorTable {
    @Id
    @Column(name = "floor_id")
    private String floorID;
    @Column(name = "floor_Name")
    private String floorName;
    @Column(name = "floor_picture")
    private String floorPicture;
    @Column(name = "floor_coordinate_x")
    private Integer floorCoordinateX;
    @Column(name = "floor_coordinate_y")
    private Integer floorCoordinateY;
    @Column(name = "floor_file")
    private String floorFile;
    @Column(name = "floor_wiedth")
    private Integer floorWiedth;
    @Column(name = "floor_height")
    private Integer floorHeight;

    public String getFloorID() {
        return floorID;
    }

    public void setFloorID(String floorID) {
        this.floorID = floorID;
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

    public Integer getFloorCoordinateX() {
        return floorCoordinateX;
    }

    public void setFloorCoordinateX(Integer floorCoordinateX) {
        this.floorCoordinateX = floorCoordinateX;
    }

    public Integer getFloorCoordinateY() {
        return floorCoordinateY;
    }

    public void setFloorCoordinateY(Integer floorCoordinateY) {
        this.floorCoordinateY = floorCoordinateY;
    }

    public String getFloorFile() {
        return floorFile;
    }

    public void setFloorFile(String floorFile) {
        this.floorFile = floorFile;
    }

    public Integer getFloorWiedth() {
        return floorWiedth;
    }

    public void setFloorWiedth(Integer floorWiedth) {
        this.floorWiedth = floorWiedth;
    }

    public Integer getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Integer floorHeight) {
        this.floorHeight = floorHeight;
    }

    @Override
    public String toString() {
        return "FloorTable{" +
                "floorID='" + floorID + '\'' +
                ", floorName='" + floorName + '\'' +
                ", floorPicture='" + floorPicture + '\'' +
                ", floorCoordinateX=" + floorCoordinateX +
                ", floorCoordinateY=" + floorCoordinateY +
                ", floorFile='" + floorFile + '\'' +
                ", floorWiedth=" + floorWiedth +
                ", floorHeight=" + floorHeight +
                '}';
    }
}
