package com.eluanps.hrworker.repository;

import com.eluanps.hrworker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
}
