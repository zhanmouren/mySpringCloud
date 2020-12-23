package com.zhan.fastupload.mapper;

import com.zhan.fastupload.bean.TblSalesOrder;
import com.zhan.fastupload.bean.TblTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * 自动创建表语句
 */
@Mapper
public interface AutoCreateTblMapper {

    //是否存在表
    int existTable(@Param("tableName") String tableName);

    //删除表
    int dropTable(@Param("tableName") String tableName);

    //创建表
    int createTable(TblTable tblTable);

    //根据id 查询销售订单
    List<TblSalesOrder> queryOrderList(TblSalesOrder tblSalesOrder);
}