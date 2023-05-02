package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.GarageService;

@RestController
public class GarageController {
	@Autowired
	private GarageService garageService;

	@RequestMapping("/cars")
	public List<Car> getCars() {
		return garageService.getCars();
	}

	@GetMapping("/car/{id}")
	public Car getCar(@PathVariable long id) {
		return garageService.getCar(id);
	}

	@PostMapping("/cars")
	public void addCar(@RequestBody Car car) {
		garageService.addCar(car);
	}

	@PutMapping("car/{id}")
	public void updateCar(@RequestBody Car car, @PathVariable long id) {
		garageService.updateCar(car, id);
	}

	@DeleteMapping("/car/{id}")
	public void deleteCar(@PathVariable Long id) {
		garageService.deleteCar(id);
	}

}
