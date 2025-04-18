package com.geek.design.patterns.solid.liskov.substitution.problem;

/*
      Liskov Substitution principle states that if class B is a subtype of class A, then we should be able
      to replace object of A with B without breaking the behaviour of the program.
        - i.e., subclass should extend the capability of parent class not narrow it down.

      Problem:
      E.g: Here Vehicle class is extended by Car, Motorcycle & Bicycle
        - Now here Class B:- Motorcycle is a subtype of class A:- Vehicle
            & we can replace vehicle object with motorcycle object without breaking the main method or behavior.
        - But in case of Class B as Bicycle, the main method behavior will break (NullPointerException)
            as Bicycle hasEngine method return null.
        - Due to Null Pointer exception, the subsequent flow breaks.

      Solution:
        - In Parent class, put only the generic methods & then extend it for Specific vehicles.
 */

import com.geek.design.patterns.solid.liskov.substitution.problem.vehicles.Bicycle;
import com.geek.design.patterns.solid.liskov.substitution.problem.vehicles.Car;
import com.geek.design.patterns.solid.liskov.substitution.problem.vehicles.MotorCycle;
import com.geek.design.patterns.solid.liskov.substitution.problem.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ProblemMain {

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());         // NullPointerException

        for(Vehicle vehicle : vehicleList) {
           System.out.println(vehicle.hasEngine().toString());
        }
    }

    public void drive() {
        // Engine start
        // Release power brake
        // Release clutch
        // Accelerate
        // Brake
        // Turn off engine
    }
}
