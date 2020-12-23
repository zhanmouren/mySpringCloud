package com.zhan.springcloudOrder.service.impl;

import com.zhan.springcloudOrder.service.payService;
import com.zhan.springcloudOrder.bean.probean;
import com.zhan.springcloudOrder.mapper.orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class paySerciveImpl implements payService {

    @Autowired
    private orderMapper payMapper;
    @Override
    public List<probean> queryProList(String username) {
        List<probean>  list=payMapper.queryProList(username);
        return list;
    }
}
