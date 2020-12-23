package com.zhan.fastupload.file;

import java.io.Serializable;

/*
  封装文件上传的bean
 */
public class FileDFSFile implements Serializable {
    //文件名字
    private String fileName;
    //文件内容
    private byte[] fileContent;
    //文件后缀
    private String ext;
    //文件MD5摘要
    private String MD5;
    //作者
    private String author;

    public FileDFSFile(String fileName, byte[] fileContent, String ext, String MD5, String author) {
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.ext = ext;
        this.MD5 = MD5;
        this.author = author;
    }

    public FileDFSFile(String fileName, byte[] fileContent, String ext) {
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.ext = ext;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
