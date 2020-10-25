package com.filipmoszczynski.module.car.repository;

import com.filipmoszczynski.module.car.entity.CarEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPagingAndSortingRepository extends PagingAndSortingRepository<CarEntity, Long> {
}
