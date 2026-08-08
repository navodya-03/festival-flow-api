package com.example.festivalflowapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stages")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    int capacity;

    @ManyToOne
    @JoinColumn(name = "festival_id")
    Festival festival;

    public Stage(){}

    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
    public Festival getFestival() {
        return festival;
    }
    public Integer getId() {
        return id;
    }


    
}
