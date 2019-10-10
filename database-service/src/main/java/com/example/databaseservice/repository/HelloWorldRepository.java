package com.example.databaseservice.repository;

import com.example.databaseservice.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorld, Long> {
}
