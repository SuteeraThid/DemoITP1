package com.example.demoITP1.model.table;

import javax.persistence.*;

@Entity
@Table(name = "tracking_active")
public class TrackingActiveTable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "active_id")
    private Long activeID;
    @Column(name = "floor_id")
    private String floorId;
    @Column(name = "tag_id")
    private String tagID;

    public Long getActiveID() {
        return activeID;
    }

    public void setActiveID(Long activeID) {
        this.activeID = activeID;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    @Override
    public String toString() {
        return "TrackingActiveTable{" +
                "activeID=" + activeID +
                ", floorId='" + floorId + '\'' +
                ", tagID='" + tagID + '\'' +
                '}';
    }
}
