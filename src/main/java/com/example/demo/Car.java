package com.example.demo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    private String name;
    @NotNull
    private String carType;
    @NotNull
    @Size(min=5,max=30)
    private String description;

    public Car(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
