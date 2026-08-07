package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.festivalflowapi.model.Festival;
import com.example.repository.FestivalRepository;
@Service
public class FestivalService {

    private final FestivalRepository festivalRepository;

    public FestivalService(FestivalRepository festivalRepository){
        this.festivalRepository = festivalRepository;
    }

    public Festival createFestival(Festival festival){

        return festivalRepository.save(festival);

    }

    public List<Festival> getAllFestivals(){
        return festivalRepository.findAll();
    }

    public Optional<Festival> getFestivalById(Long id){
        return festivalRepository.findById(id);
    }

    public Festival updateFestival(Long id,Festival festivaldetails){
        Festival temp = festivalRepository.findById(id).orElseThrow(()-> new RuntimeException("Festival not found"));
        temp.setName(festivaldetails.getName());
        return festivalRepository.save(temp);     
    }

    public void deleteFestival(Long id){

        Festival temp  = festivalRepository.findById(id).orElseThrow(()-> new RuntimeException("Festival not found"));
        festivalRepository.delete(temp);


    }
    
}
