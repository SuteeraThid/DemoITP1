package com.example.demoITP1.repository;

import com.example.demoITP1.model.response.ResponseSignIn;
import com.example.demoITP1.model.table.UserAuTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryUserAuthen extends JpaRepository<UserAuTable,Integer> {
    Optional<ResponseSignIn> findByUserEmailAndUserPassword(String userEmail, String UserPassword);
    Optional<UserAuTable> findByUserID(String userID);  // ใช้กับ ServiceUserAuthen

}

