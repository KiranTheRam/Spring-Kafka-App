package com.example.amigoscodekafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

//    This config creates a topic at start up, if it is not already created.
//    I assume we can add some more configuration here, like num of partitions

    @Bean
    public NewTopic theRamTopic() {
        return TopicBuilder
                .name("kafka-spring-app")
//                .partitions(2)
                .build();
    }
}
