package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.GarageRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GarageService {
	@Autowired
	private GarageRepository garageRepository;

	public List<Car> getCars() {
		List<Car> cars = new ArrayList<>();
		garageRepository.findAll().forEach(car -> {
			cars.add(car);
		});
		return cars;
	}

	public Car getCar(long id) {
		return garageRepository.findById(id).orElse(null);
	}

	public void addCar(Car car) {
		garageRepository.save(car);
	}

	public void updateCar(Car car, long id) {
		garageRepository.save(car);
	}

	public void deleteCar(Long id) {

		garageRepository.deleteById(id);
	}

}
