package com.geek.design.patterns.solid.liskov.substitution.problem.vehicles;

import lombok.Data;

@Data
public class Vehicle {

    private Integer speed;

    public Integer getNumberOfWheels() {
        return 4;
    }

    public Boolean hasEngine() {
        return true;
    }

    public Integer accelerate() {
        // Increase the speed
        return speed += 10;
    }
}
