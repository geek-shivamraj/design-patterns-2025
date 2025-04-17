package com.geek.design.patterns.solid.interfaces.segregation.solution;

public class Waiter implements WaiterInterface{

    @Override
    public void serverCustomers() {
        // Waiter specific
    }

    @Override
    public void takeOrder() {
        // Waiter specific
    }
}
