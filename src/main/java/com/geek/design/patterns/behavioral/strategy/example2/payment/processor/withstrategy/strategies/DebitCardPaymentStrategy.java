package com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy.strategies;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("With Strategy: Processing Debit card payment of amount: " + amount);
    }
}
