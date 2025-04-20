package com.geek.design.patterns.behavioral.observer.example1.notify.stock.observable;

import com.geek.design.patterns.behavioral.observer.example1.notify.stock.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();

}
