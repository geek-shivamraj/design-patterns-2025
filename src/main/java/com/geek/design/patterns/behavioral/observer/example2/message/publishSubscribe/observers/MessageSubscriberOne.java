package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers;

import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state.Message;

public class MessageSubscriberOne implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("Message Subscriber 1 :: " + m.getMessageContent());
    }
}
