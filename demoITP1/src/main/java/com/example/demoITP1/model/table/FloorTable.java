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
    private String floorName;
    @Column(name = "floor_picture")
    private String floorPicture;
    

}
