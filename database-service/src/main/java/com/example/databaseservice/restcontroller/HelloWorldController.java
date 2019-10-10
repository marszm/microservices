package com.example.databaseservice.restcontroller;

import com.example.databaseservice.model.HelloWorld;
import com.example.databaseservice.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @GetMapping("/allMessages")
    public List<HelloWorld> list() {

        return helloWorldRepository.findAll();

    }

}
