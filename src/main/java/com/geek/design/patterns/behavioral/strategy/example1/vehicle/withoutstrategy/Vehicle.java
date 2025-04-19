package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withoutstrategy;

/*
    Problem:
    Vehicle class is a superclass to its inheritors & some of its inheritors might use Vehicle drive() method or parent default functionality
    and some may override & define their own specific functionality.
        - There can be cases where multiple inheritors defines same functionality other than parent default functionality.
        - In this case, there will be code duplication in multiple inheritors.

    Solution:
    This code duplication can be removed by defining common strategies (Generic to multiple inheritors)
 */

public class Vehicle {
    public void drive() {
        // Some code
        System.out.println("Normal drive capability");
    }
}
