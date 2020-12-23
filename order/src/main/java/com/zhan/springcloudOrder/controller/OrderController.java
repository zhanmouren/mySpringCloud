package com.zhan.springcloudOrder.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhan.springcloudOrder.bean.ResponseData;
import com.zhan.springcloudOrder.bean.probean;
import com.zhan.springcloudOrder.service.payService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/eureka")
@Controller
public class OrderController {
    @Autowired
    private payService payservice;

    @RequestMapping(value="/queryList.api", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public String queryList (@RequestParam(required = false, name = "id") String id, @RequestParam(required = false, name = "name") String name){
        Map<String,String> map=new HashMap<>();
        map.put("name",name);
        map.put("id",id);
        map.put("price","12ff");
        map.put("ip","8001");
        return JSONObject.toJSONString(map);
    }

    @RequestMapping(value="/queryProList.api", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public ResponseData queryProList (@RequestParam(required = false, name = "name") String name){
        List<probean> list= payservice.queryProList(name);
        ResponseData responseData=ResponseData.success(list,"success");
        return responseData;

    }

}
