package com.rppf.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author RCG
 * @date 2019/2/14
 */

@EnableEurekaServer
@SpringBootApplication
public class RppfEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RppfEurekaApplication.class, args);
    }

}

