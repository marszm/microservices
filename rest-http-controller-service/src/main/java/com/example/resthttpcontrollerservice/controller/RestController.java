package com.example.resthttpcontrollerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "topic1";
    private final String URL = "http://database-service/allMessages";

    @GetMapping("/rest-service")
    public String invokeDatabaseService() {

        kafkaTemplate.send(TOPIC, URL);
        return restTemplate.getForObject(URL, String.class);

    }

}
