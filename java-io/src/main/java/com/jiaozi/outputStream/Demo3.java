package com.jiaozi.outputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-07
 **/
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("demo1.txt");
        byte[] b = new byte[2];
        int len = 0;
        while ((len= fileInputStream.read(b))!=-1){
            System.out.println(new String(b));
        }
        fileInputStream.close();
    }
}
