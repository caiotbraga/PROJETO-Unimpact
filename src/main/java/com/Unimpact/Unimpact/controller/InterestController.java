package com.Unimpact.Unimpact.controller;

import com.Unimpact.Unimpact.model.Interest;
import com.Unimpact.Unimpact.repository.InterestRepository;
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
