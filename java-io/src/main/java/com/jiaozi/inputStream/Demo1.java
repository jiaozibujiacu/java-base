package com.jiaozi.inputStream;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-06
 **/
@Log
public class Demo1 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("demo1.txt")) {
            fileOutputStream.write(97);
            fileOutputStream.write(98);
            fileOutputStream.write(99);
            byte[] bytes = "夏蒙".getBytes();
            for (byte b:bytes){
                System.out.println(b);
            }

            byte[] bytes1 = "abc".getBytes();
            // 索引 后面几个
            fileOutputStream.write(bytes1,1,2);
        } catch (IOException e) {
            log.info(e.getMessage());
        }
    }
}
