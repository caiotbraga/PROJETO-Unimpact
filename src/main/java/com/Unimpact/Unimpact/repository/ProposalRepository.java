package com.unimpact.unimpact.repository;

import com.unimpact.unimpact.model.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {
}