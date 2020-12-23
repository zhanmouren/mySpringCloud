package com.zhan.fastupload.service.impl;

import com.zhan.fastupload.bean.TblSalesOrder;
import com.zhan.fastupload.bean.TblTable;
import com.zhan.fastupload.mapper.AutoCreateTblMapper;
import com.zhan.fastupload.service.AutoCreateTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoCreateTblServiceImpl implements AutoCreateTblService {

    @Autowired
    private AutoCreateTblMapper autoCreateTblMapper;

    //是否存在表
    @Override
    public int existTable(String tableName) {
        int i=autoCreateTblMapper.existTable(tableName);
        return i;
    }

    //删除表
    @Override
    public int dropTable(String tableName) {
        int i= autoCreateTblMapper.dropTable(tableName);
        return i;
    }

    //创建表
    @Override
    public int createTable(TblTable tblTable) {
        int i=autoCreateTblMapper.createTable(tblTable);
        return i;
    }

    //创建表
    @Override
    public List<TblSalesOrder> queryOrderList(TblSalesOrder tblSalesOrder) {
        List<TblSalesOrder> orderList=autoCreateTblMapper.queryOrderList(tblSalesOrder);
        return orderList;
    }
}
