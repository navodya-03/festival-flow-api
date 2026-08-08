package com.example.festivalflowapi.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.festivalflowapi.model.Stage;
import com.example.festivalflowapi.service.StageService;

@RestController
@RequestMapping("/api/stages") // Base URL for all stage operations
public class StageController {

    private final StageService stageService;

    // Spring injects your StageService bean here via Constructor Injection
    public StageController(StageService stageService) {
        this.stageService = stageService;
    }

    // 1. Create a Stage (POST http://localhost:8080/api/stages)
    @PostMapping
    public ResponseEntity<Stage> createStage(@RequestBody Stage stage) {
        // @RequestBody tells Jackson to turn incoming JSON into the Stage object
        Stage createdStage = stageService.createStage(stage);
        return new ResponseEntity<>(createdStage, HttpStatus.CREATED);
    }

    // 2. Get All Stages (GET http://localhost:8080/api/stages)
    @GetMapping
    public ResponseEntity<List<Stage>> getAllStages() {
        return ResponseEntity.ok(stageService.getallStages());
    }

    // 3. Get Stage By ID (GET http://localhost:8080/api/stages/{id})
    @GetMapping("/{id}")
    public ResponseEntity<Stage> getStageById(@PathVariable Integer id) {
        return ResponseEntity.ok(stageService.getStageById(id));
    }

    // 4. Update a Stage (PUT http://localhost:8080/api/stages/{id})
    @PutMapping("/{id}")
    public ResponseEntity<Stage> updateStage(@PathVariable Integer id, @RequestBody Stage details) {
        return ResponseEntity.ok(stageService.updateStage(id, details));
    }

    // 5. Delete a Stage (DELETE http://localhost:8080/api/stages/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStage(@PathVariable Integer id) {
        stageService.deleteStage(id);
        return ResponseEntity.noContent().build(); // Returns HTTP 204 No Content
    }
}

