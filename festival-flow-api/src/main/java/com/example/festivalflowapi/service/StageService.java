package com.example.festivalflowapi.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.festivalflowapi.model.Stage;
import com.example.festivalflowapi.repository.StageRespository;
@Service
public class StageService {


    private final StageRespository stageRespository;


    public StageService(StageRespository stageRespository){
        this.stageRespository = stageRespository;
    }
   


    public Stage createStage(Stage stage){
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

