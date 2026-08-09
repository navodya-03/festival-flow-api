package com.example.festivalflowapi.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.example.festivalflowapi.dto.StageCreateRequest;
import com.example.festivalflowapi.model.Festival;
import com.example.festivalflowapi.model.Stage;
import com.example.festivalflowapi.repository.StageRespository;
@Service
public class StageService {


    private final StageRespository stageRespository;


    public StageService(StageRespository stageRespository){
        this.stageRespository = stageRespository;
    }
   


    public Stage createStage(StageCreateRequest dto){
        
        Stage stage = new Stage();

        stage.setName(dto.getName());
        stage.setCapacity(dto.getCapacity());

        Festival temp = new Festival();

        temp.setId(dto.getFestivalId());

        stage.setFestival(temp);

        return stageRespository.save(stage);

    }


    public List<Stage> getallStages(){
        return stageRespository.findAll();
    }


    public Stage getStageById(Integer id){


        return stageRespository.findById(id).orElseThrow(()->new RuntimeException("No stage Found"));


    }


    public Stage updateStage(Integer id,Stage details){
        Stage temp = stageRespository.findById(id).orElseThrow(()->new RuntimeException("No stage Found"));
        temp.setName(details.getName());
        return stageRespository.save(temp);
    }


    public void deleteStage(Integer id){
        Stage temp = stageRespository.findById(id).orElseThrow(()->new RuntimeException("No Stage Found"));
        stageRespository.delete(temp);
    }
}

