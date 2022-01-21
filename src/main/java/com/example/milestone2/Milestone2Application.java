package com.example.milestone2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Milestone2Application {

    public static void main(String[] args) {
        SpringApplication.run(Milestone2Application.class, args);
    }

}
