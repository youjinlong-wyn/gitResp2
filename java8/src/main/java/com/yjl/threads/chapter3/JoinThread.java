package com.yjl.threads.chapter3;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 17:07
 **/
public class JoinThread extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();

        for (int i = 0; i < 20; i++) {
            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....���߳�......." + i);


            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        JoinThread j1 = new JoinThread();
        j1.start();
        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println(".....���߳�......." + i);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


