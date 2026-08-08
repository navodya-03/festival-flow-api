package com.example.festivalflowapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.festivalflowapi.model.Festival;
import com.example.festivalflowapi.repository.FestivalRepository;
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

    public Optional<Festival> getFestivalById(Integer id){
        return festivalRepository.findById(id);
    }

    public Festival updateFestival(Integer id,Festival festivaldetails){
        Festival temp = festivalRepository.findById(id).orElseThrow(()-> new RuntimeException("Festival not found"));
        temp.setName(festivaldetails.getName());
        return festivalRepository.save(temp);     
    }

    public void deleteFestival(Integer id){

        Festival temp  = festivalRepository.findById(id).orElseThrow(()-> new RuntimeException("Festival not found"));
        festivalRepository.delete(temp);


    }
    
}
