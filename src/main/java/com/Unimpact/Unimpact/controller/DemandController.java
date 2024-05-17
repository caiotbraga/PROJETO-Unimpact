package com.unimpact.unimpact.controller;

import com.unimpact.unimpact.model.Demand;
import com.unimpact.unimpact.repository.DemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demands")
public class DemandController {

    @Autowired
    private DemandRepository demandRepository;

    @PostMapping
    public ResponseEntity<Demand> submitDemand(@RequestBody Demand demand) {
        Demand savedDemand = demandRepository.save(demand);
        return ResponseEntity.ok(savedDemand);
    }
}
