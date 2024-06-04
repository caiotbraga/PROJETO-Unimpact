package com.Unimpact.Unimpact.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Unimpact.Unimpact.model.Proposal;
import com.Unimpact.Unimpact.repository.ProposalRepository;

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

