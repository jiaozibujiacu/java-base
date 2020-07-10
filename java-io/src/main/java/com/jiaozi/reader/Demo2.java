package com.jiaozi.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-08
 **/
public class Demo2 {
    public static void main(String[] args)throws IOException {
        FileReader fileReader = new FileReader("test.txt");
        char[] c = new char[3];
        int b ;
        while ((b=fileReader.read(c))!=-1){
            System.out.println(new String(c));
            // System.out.println(new String(c,0,b));
        }
        fileReader.close();
    }
}
