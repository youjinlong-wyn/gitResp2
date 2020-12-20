package com.yjl.threads.chapter3;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 17:02
 **/
public class YieldThread extends Thread {


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();

        for (int i = 0; i < 10; i++) {
            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....子线程......." + i);
            Thread.currentThread().yield();
        }
    }

    public static void main(String[] args) {
        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.start();
        t2.start();

    }

}


