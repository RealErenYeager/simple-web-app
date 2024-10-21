package com.example.simple_web_app; // Ensure this matches your package structure

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation enables auto-configuration and component scanning
public class SimpleWebAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebAppApplication.class, args); // This starts the Spring Boot application
    }
}
