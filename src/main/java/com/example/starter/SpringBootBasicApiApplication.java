package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.example"})
@org.springframework.boot.autoconfigure.SpringBootApplication


public class SpringBootBasicApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApiApplication.class, args);
    }

}
