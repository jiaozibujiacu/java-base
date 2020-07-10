package com.jiaozi.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-07
 **/
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test.txt");
        int b;
        while ((b=fileReader.read())!=-1){
            System.out.println((char)b);
        }
        int len = fileReader.read();
        System.out.println((char)len);
        fileReader.close();
    }
}
