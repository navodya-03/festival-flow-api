package com.example.festivalflowapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.festivalflowapi.model.Festival;
import com.example.festivalflowapi.service.FestivalService;

@RestController
@RequestMapping("/api/festivals")
public class FestivalController {

    private final FestivalService festivalService;

    public FestivalController(FestivalService festivalService){
        this.festivalService = festivalService;
    }

    @PostMapping
    public Festival createFestival(@RequestBody Festival festival) {
        return festivalService.createFestival(festival);
    }

    @GetMapping
    public List<Festival> getAllFestivals(){
        return festivalService.getAllFestivals();
    }

    @GetMapping("/{id}")
    public Optional<Festival> getFestivalById(@PathVariable Integer id){
        return festivalService.getFestivalById(id);
    }

    @PutMapping("/{id}")
    public Festival updateFestival(@PathVariable Integer id,@RequestBody Festival details){

        Festival temp = festivalService.updateFestival(id, details);

        return temp;
        
    }
    @DeleteMapping("/{id}")
    public void deleteFestival(@PathVariable Integer id){
        festivalService.deleteFestival(id);
    }

}
