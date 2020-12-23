package com.zhan.fastupload.bean;

/*
 * 订单地址bean
 */
public class tbladdrdetBean {
    private String detAddrId;
    private String detAddr;
    private String detRemoteIp;

    private tbluser userbean;

    public tbluser getTbluser() {
        return userbean;
    }

    public void setTbluser(tbluser tbluser) {
        this.userbean = tbluser;
    }

    //销售订单id
    private String addrmainId;

    public String getAddrmainId() {
        return addrmainId;
    }

    public void setAddrmainId(String addrmainId) {
        this.addrmainId = addrmainId;
    }

    public String getDetAddrId() {
        return detAddrId;
    }

    public void setDetAddrId(String detAddrId) {
        this.detAddrId = detAddrId;
    }

    public String getDetAddr() {
        return detAddr;
    }

    public void setDetAddr(String detAddr) {
        this.detAddr = detAddr;
    }

    public String getDetRemoteIp() {
        return detRemoteIp;
    }

    public void setDetRemoteIp(String detRemoteIp) {
        this.detRemoteIp = detRemoteIp;
    }
}
