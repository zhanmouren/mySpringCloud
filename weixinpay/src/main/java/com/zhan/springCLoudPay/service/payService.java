package com.zhan.springCLoudPay.service;

import com.zhan.springCLoudPay.bean.probean;

import java.util.List;

public interface payService {
    List<probean> queryProList(String username);
}
