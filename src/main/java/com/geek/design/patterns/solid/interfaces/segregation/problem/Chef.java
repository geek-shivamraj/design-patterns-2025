package com.geek.design.patterns.solid.interfaces.segregation.problem;

public class Chef implements RestaurantEmployee{

    @Override
    public void washDishes() {
        // Not chef specific method
    }

    @Override
    public void serveCustomers() {
        // Not Chef specific method
    }

    @Override
    public void cookFood() {
        // Chef specific method
    }
}
