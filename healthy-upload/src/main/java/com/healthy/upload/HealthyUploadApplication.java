package com.healthy.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HealthyUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(HealthyUploadApplication.class,args);
    }
}
