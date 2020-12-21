package com.yjl.threads.chapter3;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 17:31
 **/
public class DaemonThread extends Thread {

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();

        for (int i = 0; i < 50; i++) {
            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....子线程......." + i);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        d1.setDaemon(true);
        d1.start();

        for (int i = 0; i < 20; i++) {
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println(".....主线程......." + i);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


