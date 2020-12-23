package com.zhan.cloudCoumer.mapper;

import com.zhan.cloudCoumer.bean.tblContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderConsuerMapper {
    @Select("select * from tgonggao where gongbiaoti =#{title}")
    List<tblContent> queryProList(@Param("title") String title);
}
