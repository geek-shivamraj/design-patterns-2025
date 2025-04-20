package com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer;

import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private final String emailId;
    private final StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId + ", Message: " + msg);
    }
}
