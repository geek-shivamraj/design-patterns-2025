package com.geek.design.patterns.structural.decorator.example1.coffee.machine.decorators;

import com.geek.design.patterns.structural.decorator.example1.coffee.machine.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
