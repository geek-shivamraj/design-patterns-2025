package com.geek.design.patterns.structural.decorator.example1.coffee.machine;

public class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
