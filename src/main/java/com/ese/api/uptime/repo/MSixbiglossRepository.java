package com.ese.api.uptime.repo;

import com.ese.api.uptime.model.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ese.api.uptime.model.MSixbigloss;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

public interface MSixbiglossRepository extends JpaRepository<MSixbigloss, Integer>, JpaSpecificationExecutor<MSixbigloss> {

    @Query(value = "FROM MSixbigloss p WHERE p.machineReigsterId = :machineRegisterId and p.factoryId = :factoryId" )
    List<MSixbigloss> findSixBigLossByMachineRegisterId(Integer machineRegisterId, Integer factoryId) ;
}
