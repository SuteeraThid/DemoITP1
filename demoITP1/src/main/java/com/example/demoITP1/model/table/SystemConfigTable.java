package com.example.demoITP1.model.table;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "system_config")
public class SystemConfigTable {
    @EmbeddedId
    private SystemConfigKeys keys;
    @Column(name = "context_value")
    private String contextValue;
    @Column(name = "context_note")
    private String contextNote;

    public SystemConfigTable() {
    }

    public SystemConfigKeys getKeys() {
        return keys;
    }

    public void setKeys(SystemConfigKeys keys) {
        this.keys = keys;
    }

    public String getContextValue() {
        return contextValue;
    }

    public void setContextValue(String contextValue) {
        this.contextValue = contextValue;
    }

    public String getContextNote() {
        return contextNote;
    }

    public void setContextNote(String contextNote) {
        this.contextNote = contextNote;
    }

    @Override
    public String toString() {
        return "SystemConfigTable{" +
                "keys=" + keys +
                ", contextValue='" + contextValue + '\'' +
                ", contextNote='" + contextNote + '\'' +
                '}';
    }
}
