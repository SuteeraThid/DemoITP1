package com.example.demoITP1.service;

import com.example.demoITP1.model.table.FloorTable;
import com.example.demoITP1.repository.RepositoryFloor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceFloor {
    private RepositoryFloor repositoryFloor;

    @Autowired
    private ServiceSystemConfig serviceSystemConfig;

    @Autowired
    public ServiceFloor(RepositoryFloor repositoryFloor) {
        this.repositoryFloor = repositoryFloor;
    }

    //method  เปลี่ยนภาษา ไม่ได้ใช้
    public String getFloorNameById(String floorID){
        Optional<FloorTable> floor = repositoryFloor.findById(floorID);
        if (floor.isPresent()){                     // ถ้ารับค่า floorID เข้ามา
            return floor.get().getFloorName();      // แสดงค่า floorName หรือชื่อชั้นนั่นเอง
        } else {
            return " ";                             // ถ้าไม่มีค่า floorID
        }
    }

    // อีก method นึงจะเป็นเกี่ยวกับ buildingCode และเปลี่ยนภาษา
}
