package com.example.demoITP1.model.table;

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @Column(name = "tag_date_created")
    private LocalDateTime tagDateCreated;
    @Column(name = "tag_profile_image")
    private String tagProfileImage;
    @Column(name = "tag_color")
    private String tagColor;

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

    @Override
    public String toString() {
        return "TagTable{" +
                "tagID='" + tagID + '\'' +
                ", tagNameLabel='" + tagNameLabel + '\'' +
                ", tagDateCreated=" + tagDateCreated +
                ", tagProfileImage='" + tagProfileImage + '\'' +
                ", tagColor='" + tagColor + '\'' +
                '}';
    }
}
