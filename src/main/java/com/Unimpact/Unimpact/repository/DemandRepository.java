package com.Unimpact.Unimpact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Unimpact.Unimpact.model.Demand;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
