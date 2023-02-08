package com.knoldus.spring.kafka.producer.service;

public class EventPublishException extends RuntimeException {

    public EventPublishException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
