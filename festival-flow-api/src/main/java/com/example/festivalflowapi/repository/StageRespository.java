package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.festivalflowapi.model.Stage;

@Repository
public interface StageRespository extends JpaRepository<Stage, Long> {

    
} 
