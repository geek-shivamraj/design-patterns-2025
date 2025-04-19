package com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy.strategies.CreditCardPaymentStrategy;
import com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy.strategies.DebitCardPaymentStrategy;
import com.geek.design.patterns.behavioral.strategy.example2.payment.processor.withstrategy.strategies.PaypalPaymentStrategy;

public class ClientMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPaymentStrategy());
        paymentProcessor.processPayment(100);

        paymentProcessor = new PaymentProcessor(new DebitCardPaymentStrategy());
        paymentProcessor.processPayment(200);

        paymentProcessor = new PaymentProcessor(new PaypalPaymentStrategy());
        paymentProcessor.processPayment(300);
    }
}
