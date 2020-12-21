package com.yjl.threads.chapter1;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 15:33
 **/
public class MyRunnable implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            //使用Thread.currentThread()获取当前线程
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....子线程......." + i);
        }

    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable, "我的子线程");
        t1.start();

        //main线程执行
        for (int i = 0; i < 50; i++) {
            System.out.println("-------------------------------主线程---" + i);
        }

    }
}


