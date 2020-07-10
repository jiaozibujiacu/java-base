package com.jiaozi.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: 复制文件
 * @Author: xiam
 * @Create: 2020-07-08
 **/
public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\jiaozi\\Pictures\\1565312302128.jpg");
        FileOutputStream outputStream = new FileOutputStream("test2.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        long time = System.currentTimeMillis();
        while ( (len = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        inputStream.close();
        System.out.println(System.currentTimeMillis()-time);
    }
}
