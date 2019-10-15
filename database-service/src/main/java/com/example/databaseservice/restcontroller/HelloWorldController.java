package com.example.databaseservice.restcontroller;

import com.example.databaseservice.model.HelloWorld;
import com.example.databaseservice.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class HelloWorldController {

//    List<String> messages = new ArrayList<>();
    String message;

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @KafkaListener(groupId = "topic1config", topics = "topic1", containerFactory = "kafkaListenerContainerFactory")
//    @SendTo
    public String getMsg(String data) {
        message = data;
        return data;
    }

    @GetMapping("/consumer")
    public String list1() {

        return message;

    }

    @GetMapping("/allMessages")
    public List<HelloWorld> list() {

        return helloWorldRepository.findAll();

    }

}
