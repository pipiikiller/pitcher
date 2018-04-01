package com.pitcher.backend;

import com.pitcher.backend.configuration.ConfigurationClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    
    public static void main(String[] args) {

        SpringApplication.run(ConfigurationClass.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }

}
