package com.m78.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;


public class upload {
    public static void upload(MultipartFile fileArr, String filePath, String fileName)throws Exception {
        File file=new File(filePath+"/"+fileName);
        fileArr.transferTo(file);
    }
}
