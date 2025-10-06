package com.auxiliar.my_first_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auxiliar.my_first_app.dtos.requests.CarRequest;
import com.auxiliar.my_first_app.services.HelloWorldInterface;
import com.auxiliar.my_first_app.services.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    
    @Autowired
    private HelloWorldInterface helloWorldService;

    @GetMapping    
    public String helloWorld() {
        return this.helloWorldService
            .helloWorldMessage("Aureliano");
    }

    @PostMapping
    public String postMethodName(
        @RequestBody CarRequest request
    ) {
        return request.getBrand();
    }

    @GetMapping("/{carId}")
    public String getMethodName(
        @PathVariable Long carId
    ) {
        return carId.toString();
    }
    
}
