package com.example.festivalflowapi.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "festivals")
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String location;

    public Festival(){

    }

    @OneToMany(mappedBy = "festival")
    @JsonIgnoreProperties("festival")
    List <Stage> stages = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public Integer getId(){
        return id;
    }
    public List<Stage> getStages(){
        return this.stages;

    }
    public void setId(Integer id) {
        this.id = id;
    }


    
}
