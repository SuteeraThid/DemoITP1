package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.TrackingActiveTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTrackingActive extends JpaRepository<TrackingActiveTable, Long> {
}
