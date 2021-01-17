package com.healthy.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HealthyItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthyItemServiceApplication.class,args);
    }
}
