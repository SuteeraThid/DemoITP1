package com.example.demoITP1.service;

import com.example.demoITP1.repository.RepositoryUser;
import com.example.demoITP1.repository.RepositoryUserAuthen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {
    private RepositoryUser repositoryUser;
    private RepositoryUserAuthen repositoryUserAuthen;

    @Autowired
    ServiceUserAuthen serviceUserAuthen;

}
