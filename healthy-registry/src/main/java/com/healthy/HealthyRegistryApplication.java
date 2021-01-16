package com.healthy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HealthyRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(HealthyRegistryApplication.class,args);
    }
}
