package com.digitus.springKafkaConsumer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "guides", groupId = "myGroup")
    public void consume(String message){
        logger.info(String.format("Message read => %s",message));
    }
}
