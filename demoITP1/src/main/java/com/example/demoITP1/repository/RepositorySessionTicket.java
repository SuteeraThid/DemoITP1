package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.SessionTicTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorySessionTicket extends JpaRepository<SessionTicTable, String> {
}
