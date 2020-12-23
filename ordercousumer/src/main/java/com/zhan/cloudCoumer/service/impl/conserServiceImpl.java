package com.zhan.cloudCoumer.service.impl;

import com.zhan.cloudCoumer.bean.tblContent;
import com.zhan.cloudCoumer.mapper.OrderConsuerMapper;
import com.zhan.cloudCoumer.service.conserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class conserServiceImpl implements conserService {
    @Autowired
    private OrderConsuerMapper orderConsuerMapper;

    @Override
    public List<tblContent> queryContent(String titile) {
        return orderConsuerMapper.queryProList(titile);
    }
}
