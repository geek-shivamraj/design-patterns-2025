package com.geek.design.patterns.solid.interfaces.segregation.problem;

/*
    Interfaces Segregation Principle:
        - Interfaces should be such, that client should not implement unnecessary functions they don't need.

    Question: Is RestaurantEmployee interface following Interfaces Segregation Principle ?
    Ans: NO

    Reason:
        Case 1: Waiter as Client
            - Waiter class implementing RestaurantEmployee i/f have to implement all methods,
                some of which are not relevant to the waiter.
        Case 2: Chef as Client
            - - Chef class implementing RestaurantEmployee i/f have to implement all methods,
                some of which are not relevant to the waiter.

    Solution:
        - Segregate RestaurantEmployee i/f into multiple interfaces (smaller i/fs) like
            - WaiterInterface
            - ChefInterface

 */

public interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}
