package com.zhan.springcloudgateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class MyGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        List<String> token=exchange.getRequest().getHeaders().get("token");
        //放行
        return chain.filter(exchange);
    }


    //过滤器级别 值越大则优先级越低
    @Override
    public int getOrder() {
        return 0;
    }
}
