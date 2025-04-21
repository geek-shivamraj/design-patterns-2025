package com.geek.design.patterns.structural.decorator.example1.coffee.machine.decorators;

import com.geek.design.patterns.structural.decorator.example1.coffee.machine.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }

}
