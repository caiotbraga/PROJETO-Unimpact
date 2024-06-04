package com.Unimpact.Unimpact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Unimpact.Unimpact.model.Proposal;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {
}