package com.geek.design.patterns.structural.decorator.example1.coffee.machine.decorators;

import com.geek.design.patterns.structural.decorator.example1.coffee.machine.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

}
