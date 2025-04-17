package com.geek.design.patterns.solid.liskov.substitution.problem;

/*
      Liskov Substitution principle states that if class B is a subtype of class A, then we should be able
      to replace object of A with B without breaking the behaviour of the program.
        - i.e., subclass should extend the capability of parent class not narrow it down.

      Problem:
        - E.g., here Bike i/f is implemented by Motorcycle & Bicycle
        - Now here Class B:- Motorcycle is a subtype of class A:- Bike
            & we can replace bike object with motorcycle object without breaking the drive() method or Drive Main behavior.
        - But in case of Class B as Bicycle, the drive() method behavior breaks as Bicycle doesn't support turnOnEngine & throws exception
        - Due to this exception, the subsequent flow breaks.
 */

import com.geek.design.patterns.solid.liskov.substitution.problem.vehicles.Bike;

public class DriveMain {
    private Bike bike;

    public void drive() {

        // Engine start
        bike.turnOnEngine();

        // Release power brake
        // Release clutch
        // Accelerate
        bike.accelerate();
        // Brake
        // Turn off engine
    }
}
