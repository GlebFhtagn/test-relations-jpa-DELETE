package com.example.testrelationsjpadelete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.testrelationsjpadelete.*")
@EntityScan(basePackages = {"com.example.testrelationsjpadelete.entities"})
public class TestRelationsJpaDeleteApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRelationsJpaDeleteApplication.class, args);
    }

}
