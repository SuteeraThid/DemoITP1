package com.example.demoITP1.service;

import com.example.demoITP1.model.table.UserAuTable;
import com.example.demoITP1.repository.RepositoryUser;
import com.example.demoITP1.repository.RepositoryUserAuthen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ServiceUserAuthen {
    private static final Logger logger = LoggerFactory.getLogger(ServiceUserAuthen.class);
    private RepositoryUser repositoryUser;  // ไม่เห็นจะใช้ทำไร
    private RepositoryUserAuthen repositoryUserAuthen;

    @Autowired
    public ServiceUserAuthen(RepositoryUser repositoryUser, RepositoryUserAuthen repositoryUserAuthen) {
        this.repositoryUser = repositoryUser;
        this.repositoryUserAuthen = repositoryUserAuthen;
    }
    // Method ดึงข้อมูล UserEmail โดยใช้ UserID
    public String getUserEmailByUserID(String userID){
        Optional<UserAuTable> userAuthen = repositoryUserAuthen.findByUserID(userID);
        if (userAuthen.isPresent()){
            return userAuthen.get().getUserEmail();     // ถ้าค่าไม่ว่าง จะ return ออกเป็น UserEmail ซึ่งอาจเอา email นี้ไปทำอะไรต่อมิอะไรได้
        }else {
            return null;            // ถ้าค่าไม่ว่าง จะ return เป็นค่าว่าง
        }
    }
}
