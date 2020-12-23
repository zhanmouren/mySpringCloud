package com.zhan.fastupload.util;

import com.zhan.fastupload.file.FileDFSFile;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件上传 下载 获取信息
 */
public class FastDFSUtil {
    /**
     * 加载tracker 信息
     */
    static {
        try {
            //读取resources 文件下的路径
            String fileName = new ClassPathResource("fastdfs.conf").getPath();
            //加载tracker 连接信息
            ClientGlobal.init(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /***
     * 文件上传
     */
    public String[] uploadFile(FileDFSFile fileDFSFile) throws Exception {
        //创建TrackerClient
        TrackerClient client = new TrackerClient();
        //获取连接，创建服务
        TrackerServer server = client.getConnection();
        //创建storageClient
        StorageClient storageClient = new StorageClient(server,null);
        //实现文件上传
        /*
          3个参数 第一个文件流，第二个文件的的后缀，第三个附加参数
         */
        NameValuePair[] mutFiles=new NameValuePair[1];
        NameValuePair nameValuePair=new NameValuePair();
        nameValuePair.setName("author");
        nameValuePair.setValue(fileDFSFile.getAuthor());
        mutFiles[0]=nameValuePair;
        //获取返回的文件地址"fileInfo": [ "group1", "M00/00/00/wKjHyV_bQ1uERY20AAAAANHPMow315.jpg"]
      //  String[] fileInfoData = storageClient.upload_appender_file(fileDFSFile.getFileContent(), fileDFSFile.getExt(), mutFiles);
        //访问地址类似 http://192.168.199.201:8888/group1/M00/00/00/wKjHyV_bQ1uERY20AAAAANHPMow315.jpg

        //下面获取已经上传的文件信息
        String[] fileInfoData=new String[2];
        fileInfoData[0]= "group1";
        fileInfoData[1]="M00/00/00/wKjHyV_bQ1uERY20AAAAANHPMow315.jpg";
        //获取文件信息 两个参数，group和 类似 M00/00/00/wKjHyV_bQ1uERY20AAAAANHPMow315.jpg 的参数
        FileInfo fileInfo=storageClient.get_file_info(fileInfoData[0],fileInfoData[1]);
        //文件大小
        fileInfo.getFileSize();
        //远程地址
        fileInfo.getSourceIpAddr();
        //创建时间
        fileInfo.getCreateTimestamp();

        //下面的执行的是下载文件  两个参数，group和 类似 M00/00/00/wKjHyV_bQ1uERY20AAAAANHPMow315.jpg 的参数
        byte[] bytes=storageClient.download_file(fileInfoData[0],fileInfoData[1]);
        //bytes 字节数组转为 输入流
        ByteArrayInputStream is=new ByteArrayInputStream(bytes);
        //创建一个
        //创建一个文件输出流
        FileOutputStream os=new FileOutputStream("D:/1.jpg");
        int len=0;
        byte[] buffer=new byte[1024];
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        return fileInfoData;
    }
}
