package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryUser extends JpaRepository<UserTable, Integer> {

}
