package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe;

import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observables.MessagePublisher;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observables.Subject;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers.MessageSubscriberOne;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers.MessageSubscriberThree;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers.MessageSubscriberTwo;
import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state.Message;

public class ClientMain {
    public static void main(String[] args) {

        MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree subscriberThree = new MessageSubscriberThree();

        Subject subject = new MessagePublisher();
        subject.attach(subscriberOne);
        subject.attach(subscriberTwo);

        // subscriberOne & subscriberTwo will receive the update
        subject.notifyUpdate(new Message("First Message"));

        subject.detach(subscriberOne);

        subject.attach(subscriberThree);

        // subscriberTwo & subscriberThree will receive the update
        subject.notifyUpdate(new Message("Second Message"));

    }
}
