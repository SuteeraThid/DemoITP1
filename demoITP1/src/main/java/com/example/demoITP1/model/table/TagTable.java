package com.example.demoITP1.model.table;

import com.example.demoITP1.model.list.TagList;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tag")
public class TagTable {
    @Id
    @Column(name = "tag_id")
    private String tagID;
    @Column(name = "tag_name_label")
    private String tagNameLabel;
    @Column(name = "tag_date_created")
    private LocalDateTime tagDateCreated;
    @Column(name = "tag_profile_image")
    private String tagProfileImage;
    @Column(name = "tag_color")
    private String tagColor;

    // column ที่เพิ่มเข้ามา
    @Column(name = "location_floor")
    private String locationFloor;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "last_location_floor")
    private String lastLocationFloor;
//    @Column(name = "session_tracking")
//    private String sessionTracking;       รู้สึกว่าจะต้องใช้จริงๆ แต่ขอชัวร์ๆกับพี่บูมก่อน

    public TagTable() {
    }

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getTagNameLabel() {
        return tagNameLabel;
    }

    public void setTagNameLabel(String tagNameLabel) {
        this.tagNameLabel = tagNameLabel;
    }

    public LocalDateTime getTagDateCreated() {
        return tagDateCreated;
    }

    public void setTagDateCreated(LocalDateTime tagDateCreated) {
        this.tagDateCreated = tagDateCreated;
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

    //ตรงที่เพิ่มเข้ามา


    public String getLocationFloor() {
        return locationFloor;
    }

    public void setLocationFloor(String locationFloor) {
        this.locationFloor = locationFloor;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getLastLocationFloor() {
        return lastLocationFloor;
    }

    public void setLastLocationFloor(String lastLocationFloor) {
        this.lastLocationFloor = lastLocationFloor;
    }

    @Override
    public String toString() {
        return "TagTable{" +
                "tagID='" + tagID + '\'' +
                ", tagNameLabel='" + tagNameLabel + '\'' +
                ", tagDateCreated=" + tagDateCreated +
                ", tagProfileImage='" + tagProfileImage + '\'' +
                ", tagColor='" + tagColor + '\'' +
                ", locationFloor='" + locationFloor + '\'' +
                ", createBy='" + createBy + '\'' +
                ", lastLocationFloor='" + lastLocationFloor + '\'' +
                '}';
    }
}
