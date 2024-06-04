package com.unimpact.unimpact.controller;


import com.unimpact.unimpact.model.Proposal;
import com.unimpact.unimpact.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proposals")
public class ProposalController {

    @Autowired
    private ProposalRepository proposalRepository;

    @PostMapping
    public ResponseEntity<Proposal> submitProposal(@RequestBody Proposal proposal) {
        Proposal savedProposal = proposalRepository.save(proposal);
        return ResponseEntity.ok(savedProposal);
    }
}

