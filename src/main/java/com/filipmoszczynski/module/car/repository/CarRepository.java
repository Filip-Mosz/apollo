package com.filipmoszczynski.module.car.repository;

import com.filipmoszczynski.module.car.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CarRepository extends JpaRepository<CarEntity, Long>, JpaSpecificationExecutor<CarEntity> {
    CarEntity getOneByGuid(String guid);
}

