package com.filipmoszczynski.module.car.service;

import com.filipmoszczynski.module.car.repository.CarRepository;
import com.filipmoszczynski.module.car.entity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public CarEntity getOne(String guid) {
		return carRepository.getOneByGuid(guid);
	}

	public List<CarEntity> getAll() {
		return carRepository.findAll();
	}

}

