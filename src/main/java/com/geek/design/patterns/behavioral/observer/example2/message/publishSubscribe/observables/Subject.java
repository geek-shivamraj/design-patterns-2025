package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observables;

import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers.Observer;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state.Message;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(Message m);

}
