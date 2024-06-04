package com.Unimpact.Unimpact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Unimpact.Unimpact.model.Demand;
import com.Unimpact.Unimpact.repository.DemandRepository;

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
