package com.geek.design.patterns.solid.interfaces.segregation.problem;

public class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes() {
        // This method is not required for Waiter
    }

    @Override
    public void serveCustomers() {
        // Waiter specific method
    }

    @Override
    public void cookFood() {
        // This method is not required for Waiter
    }
}
