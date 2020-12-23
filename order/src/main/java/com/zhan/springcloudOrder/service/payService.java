package com.zhan.springcloudOrder.service;
import com.zhan.springcloudOrder.bean.probean;

import java.util.List;

public interface payService {
    List<probean> queryProList(String username);
}
