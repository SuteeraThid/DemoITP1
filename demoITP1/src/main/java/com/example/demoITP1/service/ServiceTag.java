package com.example.demoITP1.service;

import com.example.demoITP1.model.list.TagList;
import com.example.demoITP1.model.request.RequestTagMonitor;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseTagMonitor;
import com.example.demoITP1.model.table.TagTable;
import com.example.demoITP1.repository.RepositoryFloor;
import com.example.demoITP1.repository.RepositoryTag;
import com.example.demoITP1.repository.RepositoryTrackingActive;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// ServiceTagMonitor
@Service
public class ServiceTag {
    private RepositoryTag repositoryTag;
    private RepositoryFloor repositoryFloor;
    private RepositoryTrackingActive repositoryTrackingActive;

    @Autowired
    private ServiceFloor serviceFloor;

    @Autowired
    ServiceTag serviceTag;

//    @Autowired
//    ImagesMasterService imagesMasterService;    // path ที่ใช้ในการเก็บ file floor plan

//    @Autowired
//    ContentDisplayService contentDisplay      // เป็นตรงที่เอาไว้โชว์คำ เช่น dropdown


    public ServiceTag(RepositoryTag repositoryTag, RepositoryFloor repositoryFloor, RepositoryTrackingActive repositoryTrackingActive) {
        this.repositoryTag = repositoryTag;
        this.repositoryFloor = repositoryFloor;
        this.repositoryTrackingActive = repositoryTrackingActive;
    }

    //ใช้กับการ export
    public Optional<TagTable> getTagDetail(String tag){
        return repositoryTag.findByTagID(tag);
    }

    // ใช้ monitor ใช้ดู tag ตามแต่ละชั้น
    public ResponseTagMonitor Monitor(RequestTagMonitor req){

        //เพิ่ม DateTimeUtils stDate

        //เพิ่ม DateTimeUtils edDate

        ResponseTagMonitor response = new ResponseTagMonitor();

        response.setTagList(new ArrayList<TagList>());              // เลือก List ตามตำแหน่ง array

        List<TagTable> tgList = repositoryTag.findByLastLocationBuildingAndLastLocationFloorAndLastSeenBetweenAndFinishDatetimeIsNullOrderByLastReceptorIdAscLastSeenDesc(req.getBuildingCode(),req.getFloorCode(),stDate,enDate,pageable);

        response.setFloorListList(receptorLocationRepository.findAllReceptorByBuildingIdAndFloorId(req.getBuildingCode(),req.getFloorCode()));      // ต้องหา floor แหละ แต่ถ้าไม่ได้ใช้ receptor(anchor) หาจะต้องเป็นอะไร ??

        if(response.getFloorListList().size()>0){
            response.setRcImg(ServiceImage.getImageURL(response.getFloorList().get(0).getRcImg()));
        }

        //สร้าง method ภายในเพิ่ม ประมาณว่าเห็นครั้งสุดท้าเมทืือไรห่
        List<String> lastActive = new ArrayList<String>();

        for (TagTable tg:tgList){   //      tg = tgList
            TagList tagList = new TagList(
                    tg.getTagID(),
                    tg.getTagNameLabel()
                    // tg.getLastSeen(),
                    // tg.getLastReceptorId()   เริ่มไม่แน่ใจแล้วว่า 2 ตัวนี้ต้องมีรึเปล่า
            );
            response.getTagList().add(tagList);
            lastActive.add(tg.getLastLocationFloor());
        }

        for (int i=0; i<response.getFloorListList().size(); i++){
            response.getFloorListList().get(i).setRcName();
            response.getFloorListList().get(i).setRcStatusName();
            response.getFloorListList().get(i).setRcSumAsset();
        }

        response.setError(ResponseCode.SUCCESS_WEB);
        return  response;
    }

}
