package com.auxiliar.my_first_app.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auxiliar.my_first_app.models.Car;

public interface CarRepository extends JpaRepository<Car, Long>
{}
    