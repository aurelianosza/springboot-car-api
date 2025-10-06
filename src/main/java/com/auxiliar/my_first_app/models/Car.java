package com.auxiliar.my_first_app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Long id;
    private String model;
    private String brand;
    private Long year;
}
