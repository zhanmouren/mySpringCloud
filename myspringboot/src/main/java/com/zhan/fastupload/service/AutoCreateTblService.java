package com.zhan.fastupload.service;


import com.zhan.fastupload.bean.TblSalesOrder;
import com.zhan.fastupload.bean.TblTable;

import java.util.List;

public interface AutoCreateTblService {
    //是否存在表
    int existTable( String tableName);

    //删除表
    int dropTable(String tableName);

    //创建表
    int createTable(TblTable tblTable);


    public List<TblSalesOrder> queryOrderList(TblSalesOrder tblSalesOrder);

}
