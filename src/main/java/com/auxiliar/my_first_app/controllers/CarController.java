package com.auxiliar.my_first_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auxiliar.my_first_app.dtos.requests.CarRequest;
import com.auxiliar.my_first_app.models.Car;
import com.auxiliar.my_first_app.services.CarRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> index()
    {
        return this.carRepository.showAll();
    }

    @PostMapping
    public Car post(
        @Valid @RequestBody CarRequest request
    ) {
        Car car = new Car();

        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setYear(request.getYear());

        Car carCreated = this.carRepository
            .create(car);
        
        return carCreated;
    }

    @GetMapping("/{carId}")
    public Car show(
        @PathVariable Long carId
    ) {
        Car car = this.carRepository
            .show(carId);

        return car;
    }

    @PatchMapping("/{carId}")
    public void update(
        @PathVariable Long carId,
        @Valid @RequestBody CarRequest request
    ) {
        Car car = new Car();

        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setYear(request.getYear());

        this.carRepository
            .update(carId, car);
    }

    @DeleteMapping("/{carId}")
    public Car destroy(
        @PathVariable Long carId
    ) {
        Car car = this.carRepository
            .delete(carId);

        return car;
    }
}
