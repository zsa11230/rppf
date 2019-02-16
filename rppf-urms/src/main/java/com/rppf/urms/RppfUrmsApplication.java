package com.rppf.urms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RppfUrmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(RppfUrmsApplication.class, args);
    }
}

