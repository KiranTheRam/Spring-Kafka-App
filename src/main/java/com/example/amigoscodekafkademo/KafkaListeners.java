package com.example.amigoscodekafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

//    This listener consumes data from Topic "kafka-spring-app" and is a part of consumer group "groupOne"
    @KafkaListener(topics = "kafka-spring-app", groupId = "groupOne")
    void listener(String data) {
        System.out.println("Listener Received message: "+ data);
    }
}
