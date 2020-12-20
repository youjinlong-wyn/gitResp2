package com.yjl.threads.chapter4;

import java.util.Arrays;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 20:30
 **/
public class ThreadSafe {

    private static int index = 0;


    public static void main(String[] args) throws InterruptedException {
        String[] s = new String[5];

        Runnable hello = new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    s[index] = "hello";
                    index++;
                }
            }
        };

        Runnable world = new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    s[index] = "world";
                    index++;
                }
            }
        };


        Thread t1 = new Thread(hello, "hello");
        Thread t2 = new Thread(world, "world");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Arrays.toString(s));

    }

}


