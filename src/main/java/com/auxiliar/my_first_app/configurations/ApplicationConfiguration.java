package com.auxiliar.my_first_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.auxiliar.my_first_app.models.Car;
import com.auxiliar.my_first_app.services.CarRepository;
import com.auxiliar.my_first_app.services.RepositoryInterface;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public RepositoryInterface<Car> carRepository() {
        return new CarRepository();
    }
}
