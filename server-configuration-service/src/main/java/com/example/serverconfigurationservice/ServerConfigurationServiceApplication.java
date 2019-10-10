package com.example.serverconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigurationServiceApplication.class, args);
    }

}
