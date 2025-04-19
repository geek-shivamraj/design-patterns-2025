package com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withoutstrategy;

public class ClientMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentType.CREDIT_CARD);
        paymentProcessor.processPayment(100);

        paymentProcessor = new PaymentProcessor(PaymentType.DEBIT_CARD);
        paymentProcessor.processPayment(200);

        paymentProcessor = new PaymentProcessor(PaymentType.PAYPAL);
        paymentProcessor.processPayment(300);
    }
}
