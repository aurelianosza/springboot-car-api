package com.auxiliar.my_first_app.dtos.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CarRequest {
    @NotBlank(message = "Should be required")
    @Size(min = 3, max = 255, message = "There are be between 3 and 255 chars")
    private String brand;
    
    @NotBlank(message = "Should be required")
    @Size(min = 5, max = 127, message = "There are be between 5 and 127 chars")
    private String model;

    @NotNull(message = "Should be required")
    @Min(value = 1960, message = "Min value: 1960")
    @Max(value = 2025, message = "Max value: current year")
    private Long year;    
}
