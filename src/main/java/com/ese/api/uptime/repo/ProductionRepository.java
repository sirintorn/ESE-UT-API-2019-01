package com.ese.api.uptime.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ese.api.uptime.model.Production;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

public interface ProductionRepository extends JpaRepository<Production, Integer>, JpaSpecificationExecutor<Production> {

    @Query(value = "FROM Production p WHERE p.machineRegisterId = :machineRegisterId and p.factoryId = :factoryId and p.statusId =:statusId  and p.planstart > current_date " )
    List<Production> findByMachineRegisterId(Integer machineRegisterId,Integer factoryId,Integer statusId) ;

    @Query(value = "FROM Production p WHERE p.machineRegisterId = :machineRegisterId and p.factoryId = :factoryId and (p.statusId =1  and p.planstart > current_date) or p.statusId = 2 " )
    List<Production> findByMachineRegisterIdForStarted(Integer machineRegisterId,Integer factoryId) ;

    @Modifying
    @Transactional
    @Query("update Production p  set p.statusId =:statusId  where p.id =:id")
    Integer updateStatusById(Integer statusId,Integer id);

    @Modifying
    @Transactional
    @Query("update Production p  set p.statusId =:statusId , p.actualstart = current_timestamp where p.id =:id")
    Integer updateActualStartById(Integer statusId,Integer id);


    @Modifying
    @Transactional
    @Query("update Production p  set p.statusId =:statusId , p.actualfinish = current_timestamp ,p.actualOk =:actualOk, p.actualNg =:actualNg where p.id =:id")
    Integer updateActualFinishById(Integer statusId,Integer id,Integer actualOk,Integer actualNg);

}
