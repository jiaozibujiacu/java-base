package com.jiaozi.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: 文件的追加
 * @Author: xiam
 * @Create: 2020-07-06
 **/
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("demo2.txt",true);
        fileOutputStream.write("abc".getBytes());
        fileOutputStream.close();
    }
}
