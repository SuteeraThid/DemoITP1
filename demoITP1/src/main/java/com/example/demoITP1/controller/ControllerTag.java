package com.example.demoITP1.controller;

import com.example.demoITP1.model.request.RequestTagMonitor;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseTagMonitor;
import com.example.demoITP1.service.ServiceSessionTicket;
import com.example.demoITP1.service.ServiceTag;
import com.example.demoITP1.utils.StringUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/tracking/api")
public class ControllerTag {
    private static final Logger logger = LoggerFactory.getLogger(ControllerTag.class);
    @Autowired
    private ServiceSessionTicket serviceSessionTicket;
    @Autowired
    private ServiceTag serviceTag;

    @PostMapping("/TagMonitor")
    public ResponseEntity tagMonitor(@RequestBody RequestTagMonitor req){
        ResponseTagMonitor response = new ResponseTagMonitor();
        try{
            logger.debug("----start tagMonitor----");
            logger.debug("RequestTagMonitor:" + req);
            ResponseCode resSession = serviceSessionTicket.checkRequestCommon(req);
            if (resSession != null){
                response.setError(resSession);
            } else if (StringUtils.isNullOREmpty(req.getFloorName())) {
                response.setError(ResponseCode.FLOORNAME_IS_EMPTY);
            } else {
                response = serviceTag.monitor(req);
            }
            response.setServerDateTime(LocalDateTime.now());
            logger.debug("ResponseTagMonitor : " + response);
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e){
            logger.debug("error : "+e.getMessage());
            logger.debug("error : Exception");
            response.setError(ResponseCode.UNKNOWN_ERROR);
            response.setServerDateTime(LocalDateTime.now());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } finally {
            logger.debug("----end tagMonitor----");
        }

    }
}
