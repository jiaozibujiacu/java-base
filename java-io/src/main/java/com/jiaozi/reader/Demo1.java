package com.jiaozi.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-07
 **/
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("demo1.txt");
        int len = fileReader.read();
        System.out.println((char)len);
        fileReader.close();
    }
}
