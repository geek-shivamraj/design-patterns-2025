package com.geek.design.patterns.behavioral.observer.example1.notify.stock;

import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observable.IphoneObservableImpl;
import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observable.StocksObservable;
import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer.EmailAlertObserverImpl;
import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer.NotificationAlertObserver;
import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer.SmsAlertObserverImpl;

public class StoreMain {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new SmsAlertObserverImpl("abc_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

        iphoneStockObservable.setStockCount(-10);

        iphoneStockObservable.setStockCount(10);

    }
}
