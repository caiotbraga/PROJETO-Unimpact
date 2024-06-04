package com.unimpact.unimpact.repository;

import com.unimpact.unimpact.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
