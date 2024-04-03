package com.digitus.springKafkaProducer.controller;

import com.digitus.springKafkaProducer.Kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("publish")
    public String publishMessage(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return "message sent successfully";
    }
}
