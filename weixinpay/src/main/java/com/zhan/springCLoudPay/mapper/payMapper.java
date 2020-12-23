package com.zhan.springCLoudPay.mapper;

import com.zhan.springCLoudPay.bean.probean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface payMapper {

    @Select("select * from tdingdan where username =#{username}")
    List<probean> queryProList(@Param("username") String username);

}
