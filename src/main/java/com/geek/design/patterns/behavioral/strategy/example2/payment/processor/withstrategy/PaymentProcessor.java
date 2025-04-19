package com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy.strategies.PaymentStrategy;

/*
    1. Now this class follows the Open-Closed principle
        - As there will be no change in case of any new payment type addition
    2. Now this class follows the Strategy design pattern
        - All the strategies are encapsulated from the context & a reference object to the Strategy is provided to context.

 */

public class PaymentProcessor {

    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
