package com.yunus.ccApp.repository;


import com.yunus.ccApp.entities.GelirGiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GelirGiderRepository extends JpaRepository<GelirGiderEntity, Long> {

    GelirGiderEntity save(GelirGiderEntity gelirGiderEntity);

    List<GelirGiderEntity> findAll();





}
