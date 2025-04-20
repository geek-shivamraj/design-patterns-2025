package com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer;

import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observable.StocksObservable;

public class SmsAlertObserverImpl implements NotificationAlertObserver {

    private String userName;
    private StocksObservable stocksObservable;

    public SmsAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to: " + userName + ", Message: " + msg);
    }
}
