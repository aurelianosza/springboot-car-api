package com.auxiliar.my_first_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.auxiliar.my_first_app.services.CarRepository;
import com.auxiliar.my_first_app.services.HelloWorldInterface;
import com.auxiliar.my_first_app.services.HelloWorldService;

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public HelloWorldInterface helloWorldInterface() {
        return new HelloWorldService();
    }

    @Bean
    public CarRepository carRepository() {
        return new CarRepository();
    }
}
