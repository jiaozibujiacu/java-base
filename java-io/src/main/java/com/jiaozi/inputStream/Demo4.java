package com.jiaozi.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-08
 **/
public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("test.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        inputStream.close();
    }
}
