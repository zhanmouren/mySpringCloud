package com.zhan.cloudCoumer.service;

import com.zhan.cloudCoumer.bean.ResponseData;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "CLOUDSERVERORDER")
public interface CustomerService {
   @PostMapping("/api/eureka/queryProList.api")
    public ResponseData queryProList (@RequestParam("name") String name);
}
