package com.example.amigoscodekafkademo.controller;

import com.example.amigoscodekafkademo.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/message")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private final Logger log = LoggerFactory.getLogger(MessageController.class.getSimpleName());

    @Autowired
    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    This takes in a "message" value from a POST req using JSON
    @PostMapping("/post")
    public String publish(@RequestBody Message newReq) {
        log.info("Received message, sending to Kafka");
        kafkaTemplate.send("kafka-spring-app", newReq.getMessageContent());
        log.info("Message Sent!\n" + newReq.getMessageContent());

        return "Message Sent!\n"+ newReq.getMessageContent();
    }

//    Takes a message as a path variable (not the best)
    @PostMapping("/newMsg/{message}")
    public String publish(@PathVariable("message") String message) {
        log.info("Received message, sending to Kafka");
        kafkaTemplate.send("kafka-spring-app", message);
        log.info("Message Sent!\n Content: " + message);
        return "Message Sent!\n Content: " + message;
    }
}
