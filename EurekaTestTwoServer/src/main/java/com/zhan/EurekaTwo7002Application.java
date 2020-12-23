package com.zhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaTwo7002Application {
      public static  void main(String[] args){
            SpringApplication.run(EurekaTwo7002Application.class,args);
        }

}
