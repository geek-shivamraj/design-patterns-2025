package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("With Strategy: Normal Drive Capability");
    }
}
