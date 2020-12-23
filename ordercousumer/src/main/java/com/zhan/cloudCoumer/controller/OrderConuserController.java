package com.zhan.cloudCoumer.controller;

import com.zhan.cloudCoumer.bean.ResponseData;
import com.zhan.cloudCoumer.bean.tblContent;
import com.zhan.cloudCoumer.service.CustomerService;
import com.zhan.cloudCoumer.service.conserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/orderconsumer/eureka")
@Controller
public class OrderConuserController {

    //请求地址     具体地址
    // private String url="http://127.0.0.1:9999"
    private  final String  url="http://CLOUDSERVERORDER";

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private conserService conserservice;

    @GetMapping("/test")
    @ResponseBody
    public void  getList(@RequestParam(required = false, name = "id") String id, @RequestParam(required = false, name = "name") String name){
        String finalUrl=url+"/api/eureka/queryList.api?id="+id+"&name="+name;
        Map<String,String> map=new HashMap<>();
        map.put("name",name);
        map.put("id",id);
        Map<String,String>  value=restTemplate.postForObject(finalUrl,map,Map.class);
        for (Map.Entry<String, String> entry : value.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    @RequestMapping(value="/queryProList.api", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public ResponseData queryProList (@RequestParam(required = false, name = "name") String name){
        ResponseData responseData= customerService.queryProList(name);
        return responseData;
    }

    @RequestMapping(value="/queryConent.api", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public ResponseData queryConent (@RequestParam(required = false, name = "title") String title){
        List<tblContent> list= conserservice.queryContent(title);
        ResponseData responseData= ResponseData.success(list,"成功");
        return responseData;
    }
}
