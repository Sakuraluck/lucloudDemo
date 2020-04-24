package com.could.eureka3000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka3000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3000Application.class, args);
    }

}
