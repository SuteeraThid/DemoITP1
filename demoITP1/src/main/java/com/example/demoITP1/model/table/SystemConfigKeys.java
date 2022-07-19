package com.example.demoITP1.model.table;

import javax.persistence.Column;
import java.io.Serializable;


public class SystemConfigKeys implements Serializable {
    @Column(name = "context_date", nullable = false)
    private String contextData;
    @Column(name = "context_name", nullable = false)
    private String contextName;
    public SystemConfigKeys(){

    }

    public SystemConfigKeys(String contextData, String contextName) {
        this.contextData = contextData;
        this.contextName = contextName;
    }

    public String getContextData() {
        return contextData;
    }

    public void setContextData(String contextData) {
        this.contextData = contextData;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    @Override
    public String toString() {
        return "SystemConfigKeys{" +
                "contextDate='" + contextData + '\'' +
                ", contextName='" + contextName + '\'' +
                '}';
    }
}
