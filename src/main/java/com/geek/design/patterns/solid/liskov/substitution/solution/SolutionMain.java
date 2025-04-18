package com.geek.design.patterns.solid.liskov.substitution.solution;

import com.geek.design.patterns.solid.liskov.substitution.solution.vehicles.Bicycle;
import com.geek.design.patterns.solid.liskov.substitution.solution.vehicles.MotorCycle;
import com.geek.design.patterns.solid.liskov.substitution.solution.vehicles.Vehicle;
import com.geek.design.patterns.solid.liskov.substitution.solution.vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class SolutionMain {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList) {
            System.out.println("No. of Wheels in " + vehicle.getClass().getName() + " : " + vehicle.getNumberOfWheels().toString());
        }
    }

}
