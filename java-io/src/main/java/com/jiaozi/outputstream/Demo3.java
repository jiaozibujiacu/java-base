package com.jiaozi.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-06
 **/
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("demo3.txt",true);
        fileOutputStream.write("abc".getBytes());
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("hello".getBytes());
        fileOutputStream.close();
    }
}
