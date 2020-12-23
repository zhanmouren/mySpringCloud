package com.zhan.fastupload.bean;

import java.util.List;

/**
 * 销售订单主表
 */
public class TblSalesOrder {
    //销售订单id
    private String  orderId;
    //销售订单编号
    private String  orderNo;
    //地址
    private String orderAddress;

    private List<TblSalesOrderDet> orderDetList;

    private List<tbladdrdetBean> addrDetList;

    public List<tbladdrdetBean> getAddrDetList() {
        return addrDetList;
    }

    public void setAddrDetList(List<tbladdrdetBean> addrDetList) {
        this.addrDetList = addrDetList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public List<TblSalesOrderDet> getOrderDetList() {
        return orderDetList;
    }

    public void setOrderDetList(List<TblSalesOrderDet> orderDetList) {
        this.orderDetList = orderDetList;
    }
}
