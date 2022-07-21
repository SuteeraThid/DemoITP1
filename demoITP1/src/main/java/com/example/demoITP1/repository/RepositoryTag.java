package com.example.demoITP1.repository;

import com.example.demoITP1.model.table.TagTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryTag extends JpaRepository<TagTable, String>  {
Optional<TagTable> findByTagID(String tag);
List<TagTable> findByLastLocationBuildingAndLastLocationFloorAndLastSeenBetweenAndFinishDatetimeIsNullOrderByLastReceptorIdAscLastSeenDesc()
}
