package com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withoutstrategy;

/*
    Problem with this code:
    1. This class violates the Open-Closed Principle, that states - Classes should be open for extension but closed for modification.
        - In this code, if we want to add a new payment type, we would have to modify the processPayment() method, that violates the OC principle
    2. This class violates the Strategy pattern by using conditional statements to determine the type of payment & then process it accordingly.
        - This approach can quickly become unmanageable & inflexible as the number of payment types increases.

    Solution:
    To fix this problem, we can use the Strategy Design Pattern.
        - We can define a common interface for all payment strategies, which in this case is the PaymentStrategy interface.

 */

public class PaymentProcessor {

    private final PaymentType paymentType;

    public PaymentProcessor(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void processPayment(double amount) {
        if (paymentType == PaymentType.CREDIT_CARD) {
            System.out.println("Without Strategy: Processing Credit card payment of amount: " + amount);
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            System.out.println("Without Strategy: Processing Debit card payment of amount: " + amount);
        } else if (paymentType == PaymentType.PAYPAL) {
            System.out.println("Without Strategy: Processing Paypal payment of amount: " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
