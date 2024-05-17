package com.unimpact.unimpact.controller;

import com.unimpact.unimpact.model.Interest;
import com.unimpact.unimpact.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interests")
public class InterestController {

    @Autowired
    private InterestRepository interestRepository;

    @PostMapping
    public ResponseEntity<Interest> registerInterest(@RequestBody Interest interest) {
        Interest savedInterest = interestRepository.save(interest);
        return ResponseEntity.ok(savedInterest);
    }
}
