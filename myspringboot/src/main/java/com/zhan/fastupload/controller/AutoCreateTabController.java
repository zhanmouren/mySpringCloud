package com.zhan.fastupload.controller;

import com.zhan.fastupload.bean.ResponseData;
import com.zhan.fastupload.bean.TblSalesOrder;
import com.zhan.fastupload.bean.TblTable;
import com.zhan.fastupload.service.AutoCreateTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * 通过mybatis 自动创表
 */
@RequestMapping("/auto")
@RestController
public class AutoCreateTabController {

    @Autowired
    private AutoCreateTblService autoCreateTblService;

    //是否存在表
    @PostMapping(value = "/existTable.api")
    @ResponseBody
    public ResponseData existTable(@RequestBody TblTable tblTable){
        int i=autoCreateTblService.existTable(tblTable.getTableName());
        if(i>0){
            return  ResponseData.success(tblTable.getTableName()+"存在表");
        }else{
            return ResponseData.success(tblTable.getTableName()+"不存在");
        }
    }

    //创建表
    @PostMapping(value = "/createTable.api")
    @ResponseBody
    public ResponseData createTable(@RequestBody TblTable tblTable){
        int i=autoCreateTblService.createTable(tblTable);
        System.out.print("i的值为："+i);
        if(i>0){
            return  ResponseData.success(tblTable.getTableName()+"创建成功");
        }else{
            return ResponseData.faill(tblTable.getTableName()+"创建失败");
        }
    }

    //删除表
    @PostMapping(value = "/dropTable.api")
    @ResponseBody
    public ResponseData dropTable(@RequestBody TblTable tblTable){
        int i=autoCreateTblService.dropTable(tblTable.getTableName());
        if(i>0){
            return  ResponseData.success(tblTable.getTableName()+"创建成功");
        }else{
            return ResponseData.faill(tblTable.getTableName()+"创建失败");
        }
    }


    //根据id查询销售订单
    @PostMapping(value = "/queryOrderList.api")
    @ResponseBody
    public ResponseData queryOrderList(@RequestBody TblSalesOrder TblSalesOrder){
        List<TblSalesOrder> orderList=autoCreateTblService.queryOrderList(TblSalesOrder);
        return  ResponseData.success(orderList,"成功");
    }

}
