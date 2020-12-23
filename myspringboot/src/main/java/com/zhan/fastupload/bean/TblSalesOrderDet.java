package com.zhan.fastupload.bean;

/*
  销售订单明细
 */
public class TblSalesOrderDet {

    //id
    private String detId;
    //产品名称
    private String proName;
    //产品价格
    private double proPrice;

    private String ordermainId;

    public String getOrdermainId() {
        return ordermainId;
    }

    public void setOrdermainId(String ordermainId) {
        this.ordermainId = ordermainId;
    }

    public String getDetId() {
        return detId;
    }

    public void setDetId(String detId) {
        this.detId = detId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }
}
