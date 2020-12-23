package com.zhan.springCLoudPay.service.impl;

import com.zhan.springCLoudPay.bean.probean;
import com.zhan.springCLoudPay.mapper.payMapper;
import com.zhan.springCLoudPay.service.payService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.zhan.springCLoudPay.mapper.payMapper;
import org.springframework.stereotype.Service;


@Service
public class paySerciveImpl implements payService {

    @Autowired
    private payMapper payMapper;
    @Override
    public List<probean> queryProList(String username) {
        List<probean>  list=payMapper.queryProList(username);
        return list;
    }
}
