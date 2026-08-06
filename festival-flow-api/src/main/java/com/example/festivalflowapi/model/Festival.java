package com.example.festivalflowapi.model;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long festivalId;
    String name;
    String location;

    public Festival(){

    }

    @OneToMany(mappedBy = "festival")
    List <Stage> stages = new ArrayList<>();



    
}
