package com.example.databaseservice.model;

import javax.persistence.*;

@Entity
@Table(name = "HELLO_WORLD")

public class HelloWorld {

    @Id
    @GeneratedValue

    private Long id;

    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                ", id=" + id +
                '}';
    }
}
