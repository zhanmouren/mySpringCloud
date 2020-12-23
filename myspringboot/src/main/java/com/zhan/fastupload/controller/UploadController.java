package com.zhan.fastupload.controller;

import com.zhan.fastupload.bean.ResponseData;
import com.zhan.fastupload.file.FileDFSFile;
import com.zhan.fastupload.util.FastDFSUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/api/upload")
@RestController
public class UploadController {

    /*
     * 文件上传
     */
    @PostMapping(value = "uploadFile.api")
    public ResponseData uploadFile(@RequestParam(value="file") MultipartFile file) throws  Exception{
          //封装文件信息
        FileDFSFile fileDFSFile=new FileDFSFile(
                file.getOriginalFilename(),
                file.getBytes(),
                StringUtils.getFilenameExtension(file.getOriginalFilename())

        );
        //执行上传文件
        FastDFSUtil fastDFSUtil=new FastDFSUtil();
        String[] fileInfo=fastDFSUtil.uploadFile(fileDFSFile);
        return  ResponseData.success(fileInfo,"上传文件成功");
    }
}
