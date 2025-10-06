package com.auxiliar.my_first_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements HelloWorldInterface{
    
    public String helloWorldMessage(String name) {
        return "Hello World!!! " + name;
    }

}
