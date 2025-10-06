package com.auxiliar.my_first_app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.auxiliar.my_first_app.models.Car;

public class CarRepository {
    
    private Long currentId = (long)0;
    private List<Car> carList;

    public CarRepository() {
        this.carList = new ArrayList<Car>();
    }

    public List<Car> showAll()
    {
        return this.carList;
    }

    public Car create(Car carData)
    {
        this.currentId++;
        carData.setId(this.currentId);
        this.carList.add(carData);
        return carData;
    }

    public Car show(Long carId)
    {
        for (Car car: this.carList) {
            if (car.getId() == carId) {
                return car;
            }
        }

        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Car not exists"
        );
    }

    public Car update(Long carId, Car carData)
    {
        Car car = this.show(carId);

        car.setBrand(carData.getBrand());
        car.setModel(carData.getModel());
        car.setYear(carData.getYear());

        return car;
    }

    public Car delete(Long carId)
    {
        Car car = this.show(carId);

        this.carList
            .remove(car);

        return car;
    }
}
