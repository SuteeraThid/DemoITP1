package com.example.demoITP1.service;

import com.example.demoITP1.model.table.SystemConfigKeys;
import com.example.demoITP1.model.table.SystemConfigTable;
import com.example.demoITP1.repository.RepositorySystemConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ServiceSystemConfig {
    private static final Logger logger = LoggerFactory.getLogger(ServiceSystemConfig.class);

    private RepositorySystemConfig repositorySystemConfig;

    //constructor ของตัวเอง
    @Autowired
    public ServiceSystemConfig(RepositorySystemConfig repositorySystemConfig) {
        this.repositorySystemConfig = repositorySystemConfig;
    }

    //Method เอาไว้ดึง SystemConfig
    public String retrieveSystemConfig(String contextData, String contextName){ // เอามาจาก SystemConfigKey
        SystemConfigKeys keys = new SystemConfigKeys(contextData, contextName);
        Optional<SystemConfigTable> systemConfig = repositorySystemConfig.findById(keys);
        return systemConfig.map(SystemConfigTable::getContextValue).orElse(null);
    }
}
