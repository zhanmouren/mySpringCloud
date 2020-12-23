package com.zhan.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class gateway9527Application {
    public static  void main(String[] args){
        SpringApplication.run(gateway9527Application.class,args);
    }

    //创建用户的唯一标识，实现ip限流
    @Bean("keyResolver")
    public KeyResolver keyResolver(){
       return new KeyResolver(){
           @Override
           public Mono<String> resolve(ServerWebExchange exchange){
               String ip=exchange.getRequest().getRemoteAddress().getHostString();
               System.out.print("用户请求的ip为："+ip);
               return Mono.just(ip);
           }
       };
    }

}
