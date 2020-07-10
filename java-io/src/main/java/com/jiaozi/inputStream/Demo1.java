package com.jiaozi.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-06
 **/

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("demo1.txt");
        int read = fileInputStream.read();
        System.out.println((char)read);
        fileInputStream.close();
    }
}
