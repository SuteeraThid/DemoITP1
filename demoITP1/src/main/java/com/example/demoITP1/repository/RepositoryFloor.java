package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.FloorTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFloor extends JpaRepository<FloorTable, String> {
}
