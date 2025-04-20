package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observables;

import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers.Observer;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state.Message;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(Observer o : observerList) {
            o.update(m);
        }
    }
}
