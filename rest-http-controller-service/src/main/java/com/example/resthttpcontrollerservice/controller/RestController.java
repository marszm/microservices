package com.example.resthttpcontrollerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private RestTemplate restTemplate;
//    private KafkaTemplate<String, Object> kafkaTemplate;

//    private final String topic = "topic1";
    private final String url = "http://database-service/allMessages";

    @GetMapping("/rest-service")
    public String invokeDatabaseService() {
//        kafkaTemplate.send(topic, url);
        return restTemplate.getForObject(url, String.class);

    }

    //Kafka
//    @GetMapping("/rest-servicekafka")
//    public String invokeDatabaseServiceKafka() {
//
//        String url = "http://database-service/allMessages";
//        kafkaTemplate.send(topic, url);
//        return "OK!";

//    }

}
