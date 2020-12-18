package com.yjl.threads;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-09 11:40
 **/
public class MuliThread {

    public static void main(String[] args) {
        //Integer i1 = 40;
        //Integer i2 = 40;
        //Integer i3 = 0;
        //Integer i4 = new Integer(40);
        //Integer i5 = new Integer(40);
        //Integer i6 = new Integer(0);
        //
        //System.out.println("i1=i2   " + (i1 == i2));
        //System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
        //System.out.println("i1=i4   " + (i1 == i4));
        //System.out.println("i4=i5   " + (i4 == i5));
        //System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
        //System.out.println("40=i5+i6   " + (40 == i5 + i6));


        Map<String, String> map = new HashMap<>();
        map.put("张三", "张三");
        map.put("李四", "李四");
        map.put("测试1", "测试1");
        map.put("测试2", "测试2");
        map.put("王五", "王五");

        System.out.println(map.get("张三"));


    }

}
