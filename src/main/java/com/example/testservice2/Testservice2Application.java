package com.example.testservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Testservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Testservice2Application.class, args);
    }

}
