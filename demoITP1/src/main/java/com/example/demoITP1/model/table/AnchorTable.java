package com.example.demoITP1.model.table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "anchor")
public class AnchorTable {
    @Id
    @Column(name = "anchor_id")
    private String anchorID;
    @Column(name = "anchor_name_label")
    private String anchorNameLabel;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @Column(name = "anchor_date_created")
    private LocalDateTime anchorDateCreated;
    @Column(name = "anchor_point_x")
    private int anchorPointX;
    @Column(name = "anchor_point_y")
    private int anchorPointY;

    public AnchorTable() {
    }

    public String getAnchorID() {
        return anchorID;
    }

    public void setAnchorID(String anchorID) {
        this.anchorID = anchorID;
    }

    public String getAnchorNameLabel() {
        return anchorNameLabel;
    }

    public void setAnchorNameLabel(String anchorNameLabel) {
        this.anchorNameLabel = anchorNameLabel;
    }

    public LocalDateTime getAnchorDateCreated() {
        return anchorDateCreated;
    }

    public void setAnchorDateCreated(LocalDateTime anchorDateCreated) {
        this.anchorDateCreated = anchorDateCreated;
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

    @Override
    public String toString() {
        return "AnchorTable{" +
                "anchorID='" + anchorID + '\'' +
                ", anchorNameLabel='" + anchorNameLabel + '\'' +
                ", anchorDateCreated=" + anchorDateCreated +
                ", anchorPointX=" + anchorPointX +
                ", anchorPointY=" + anchorPointY +
                '}';
    }
}
