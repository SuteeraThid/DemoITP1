package com.example.demoITP1.service;

import com.example.demoITP1.model.request.RequestCommon;
import com.example.demoITP1.model.request.RequestSignIn;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseSignIn;
import com.example.demoITP1.repository.RepositoryUserAuthen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceSignIn{

    private static final Logger logger = LoggerFactory.getLogger(ServiceSignIn.class);

    /* log = การเก็บ log
       log ช่วยแจ้ง Error ได้ใน Exception -> " logger.debug("error : "+e.getMessage()); "
       ประเภท log 4 -> DEBUG(แสดงข้อมูงบางอย่างเพื่อ debug), WARN(เอาไว้เตือน warning ในส่วนที่อาจพังได้ในอนาคต),
       INFO(ไว้ใส่ข้อมูลเฉยๆ), Error(ไว้แสดง Error ว่ามีอะไรพัง)
    */

    private RepositoryUserAuthen repositoryUserAuthen;

    @Autowired
    private ServiceSessionTicket serviceSessionTicket;


    @Autowired
    public ServiceSignIn(RepositoryUserAuthen repositoryUserAuthen) {
        this.repositoryUserAuthen = repositoryUserAuthen;
    }
    //ต้องใช้ constructor นี้ต่อในหน้า controller
    public ResponseSignIn signIn(RequestSignIn req){
        Optional<ResponseSignIn> response = repositoryUserAuthen.findByUserEmailAndUserPassword(req.getUserEmail(), req.getUserPassword());

        if (!response.isPresent() /* || response != ข้อมูลในตาราง*/ ){
            ResponseSignIn resError = new ResponseSignIn();
            resError.setError(ResponseCode.LG00103);
            return resError;
        }

        String uniqueID = serviceSessionTicket.generateSessionTicket(req.getUserEmail());   //// จะ generateSessionTicket
        response.get().setSessionID(uniqueID);
        response.get().setError(ResponseCode.SUCCESS_WEB);
        return response.get();
    }
    public void signOut(RequestCommon req){serviceSessionTicket.deleteSession(req.getSessionID());
    }

}

