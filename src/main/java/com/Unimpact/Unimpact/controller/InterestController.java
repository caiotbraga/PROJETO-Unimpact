package com.unimpact.unimpact.controller;

import com.unimpact.unimpact.exceptions.ResourceNotFoundException;
import com.unimpact.unimpact.model.Interest;
import com.unimpact.unimpact.repository.InterestRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interests")
public class InterestController {

    @Autowired
    private InterestRepository interestRepository;

    @GetMapping
    public List<Interest> getAllInterests() {
        return interestRepository.findAll();
    }

    @PostMapping
    public Interest createInterest(@RequestBody Interest interest) {
        return interestRepository.save(interest);
    }

    @GetMapping("/{id}")
    public Interest getInterestById(@PathVariable Long id) {
        return interestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Interest not found"));
    }

    @PutMapping("/{id}")
    public Interest updateInterest(@PathVariable Long id, @RequestBody Interest interestDetails) {
        Interest interest = interestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Interest not found"));
        interest.setName(interestDetails.getName());
        return interestRepository.save(interest);
    }

    @DeleteMapping("/{id}")
    public void deleteInterest(@PathVariable Long id) {
        Interest interest = interestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Interest not found"));
        interestRepository.delete(interest);
    }
}
