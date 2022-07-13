package com.example.demoITP1.repository;

import com.example.demoITP1.model.response.ResponseSignIn;
import com.example.demoITP1.model.table.UserAuTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryUserAuthen extends JpaRepository<UserAuTable,Integer> {
    Optional<UserAuTable> findByUserSignIn(String userSignin);
    Optional<ResponseSignIn> findAll(String userEmail, String UserPassword);

}

