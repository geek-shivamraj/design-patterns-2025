package com.geek.design.patterns.behavioral.observer.example2.message.publishSubscribe.state;

import lombok.Data;

@Data
public class Message {

    private final String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }
}
