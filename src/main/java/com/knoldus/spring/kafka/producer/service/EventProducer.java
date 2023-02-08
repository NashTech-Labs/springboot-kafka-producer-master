package com.knoldus.spring.kafka.producer.service;

import com.knoldus.spring.kafka.events.AccountAsyncEvent;
import com.knoldus.spring.kafka.events.DataMessageAsyncEvent;

public interface EventProducer {

    void sendMessage(DataMessageAsyncEvent message) throws EventPublishException;

    void sendAccountMessage(AccountAsyncEvent accountAsyncEvent) throws EventPublishException;

}
