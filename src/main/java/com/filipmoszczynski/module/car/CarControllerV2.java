package com.filipmoszczynski.module.car;

import com.filipmoszczynski.core.pagination.ListResponse;
import com.filipmoszczynski.module.car.dto.CarDto;
import com.filipmoszczynski.module.car.entity.CarEntity;
import com.filipmoszczynski.module.car.mapper.CarMapper;
import com.filipmoszczynski.module.car.repository.CarPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarControllerV2 {

	@Autowired
	private CarPagingAndSortingRepository repository;

	@GetMapping("/api/v2/cars")
	public ListResponse getCars(
		@RequestParam(value ="page", defaultValue = "0")
		int page,
		@RequestParam(value ="size",  defaultValue = "10")
		int size) {

		Page<CarEntity> carPage = repository.findAll(PageRequest.of(page, size));

		List<CarDto> carList = CarMapper.map(carPage.getContent());

		return new ListResponse(
				carList,
				carPage.getTotalPages(),
				carPage.getTotalElements(),
				carPage.getSize(),
				carPage.getNumber()
		);
	}

}
