package com.filipmoszczynski.module.car.mapper;

import com.filipmoszczynski.module.car.dto.CarDetailsDto;
import com.filipmoszczynski.module.car.entity.CarDetailsEntity;

public class CarDetailsMapper {

	public static CarDetailsDto map(CarDetailsEntity details) {
		if (details == null) {
			return new CarDetailsDto();
		}
		return new CarDetailsDto()
				.setFirstName(details.getFirstName())
				.setLastName(details.getLastName());
	}
}

