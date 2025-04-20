package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.observers;

import com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state.Message;

public interface Observer {

    void update(Message m);

}
