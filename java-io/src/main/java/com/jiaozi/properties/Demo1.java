package com.jiaozi.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2020-07-08
 **/
public class Demo1 {
    public static void main(String[] args)throws IOException {

        Properties properties = new Properties();
//        properties.setProperty("hello","xiam");
//        properties.setProperty("hello1","xiay");
//        System.out.println(properties);
//        System.out.println(properties.getProperty("hello"));
//
//        Set<String> keys =  properties.stringPropertyNames();
//        for(String key :  keys){
//            System.out.println(key+properties.getProperty(key));
//        }

        properties.load(new FileReader("properties.txt"));
        Set<String> keys =  properties.stringPropertyNames();
        for(String key :  keys){
            System.out.println(key+properties.getProperty(key));
        }
    }
}
