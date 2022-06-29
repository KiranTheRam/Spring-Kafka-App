package com.example.amigoscodekafkademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class AmigosCodeKafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosCodeKafkaDemoApplication.class, args);
    }

//    The KafkaTemplate being INJECTED here is from the KafkaProducerConfig that was created as a bean
//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
//        return args -> {
//          kafkaTemplate.send("theram", "This comes from CommandLineRunner. Proves systems are operational!");
//        };
//    }

}
