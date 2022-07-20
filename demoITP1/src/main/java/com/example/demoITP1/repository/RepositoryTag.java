package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.TagTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTag extends JpaRepository<TagTable, String>  {

}
