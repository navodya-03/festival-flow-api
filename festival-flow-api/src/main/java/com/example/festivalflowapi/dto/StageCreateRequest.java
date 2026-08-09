package com.example.festivalflowapi.dto;

public class StageCreateRequest {
    private String name;
    private Integer capacity;
    private Integer festivalId;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity){
        this.capacity = capacity;
    }
    public void setFestivalId(Integer festivalId) {
        this.festivalId = festivalId;
    }
    public Integer getFestivalId() {
        return festivalId;
    }
    
}
