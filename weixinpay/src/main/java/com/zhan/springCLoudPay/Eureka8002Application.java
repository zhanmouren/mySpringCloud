package com.zhan.springCLoudPay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Eureka8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8002Application.class, args);

    }
}

