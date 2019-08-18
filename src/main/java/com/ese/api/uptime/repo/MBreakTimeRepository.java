package com.ese.api.uptime.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ese.api.uptime.model.MBreakTime;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")

public interface MBreakTimeRepository extends JpaRepository<MBreakTime, Integer>, JpaSpecificationExecutor<MBreakTime> {

}
