package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RepositoryUser extends JpaRepository<UserTable, Integer> {

}
