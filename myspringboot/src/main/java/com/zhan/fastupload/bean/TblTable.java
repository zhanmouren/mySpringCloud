package com.zhan.fastupload.bean;
/*
  表字段
 */
public class TblTable {
    //表名
    private String tableName;
    //表字段id
    private Integer id;
    //字段用户名
    private String user_name;
    //字段操作
    private String  operation;
    //请求方式
    private String method;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
