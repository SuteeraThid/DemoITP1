package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.SystemConfigKeys;
import com.example.demoITP1.model.table.SystemConfigTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorySystemConfig extends JpaRepository<SystemConfigTable, SystemConfigKeys> {
}
