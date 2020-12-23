package com.zhan.fastupload.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //声明一个主体，用的是javabean 下的一个标准
@Table(name="T_STUDENT")   //映射表的名称
public class StudentInfoBean {

    //学号
    @Id
    private String stuNum;

    //姓名
    @Column(length = 20)
    private String stuName;

    //a爱好
    private String stuhobby;

   //年龄
    private Integer stuage;

    public String getStuhobby() {
        return stuhobby;
    }

    public void setStuhobby(String stuhobby) {
        this.stuhobby = stuhobby;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
