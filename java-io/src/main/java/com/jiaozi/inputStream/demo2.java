package com.jiaozi.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-07
 **/
public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("demo1.txt");
        int b = 0;
        while ((b=fileInputStream.read())!=-1){
            System.out.println((char)b);
        }
        fileInputStream.close();
    }
}
