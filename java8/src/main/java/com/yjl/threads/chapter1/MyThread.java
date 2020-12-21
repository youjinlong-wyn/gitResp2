package com.yjl.threads.chapter1;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 14:36
 **/
public class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //第一种，通过this获取，这种必须继承thread类
            //String threadName = this.getName();
            //Long threadId = this.getId();

            //第二种使用Thread.currentThread()获取当前线程
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();


            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....子线程......." + i);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("我的子线程1");
        //thread.setName("我的子线程1");
        //子线程执行
        thread.start();


        MyThread thread2 = new MyThread("我的子线程2");
        //thread2.setName("我的子线程2");
        //子线程执行
        thread2.start();

        //main线程执行
        for (int i = 0; i < 50; i++) {
            System.out.println("-------------------------------主线程---" + i);
        }
    }

}


