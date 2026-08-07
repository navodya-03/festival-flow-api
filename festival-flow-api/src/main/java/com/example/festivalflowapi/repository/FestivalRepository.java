package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.festivalflowapi.model.Festival;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long> {

    
}