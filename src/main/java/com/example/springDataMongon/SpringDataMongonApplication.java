package com.example.springDataMongon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication(scanBasePackages = {"com.example.springDataMongon"})
public class SpringDataMongonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongonApplication.class, args);
    }

}
