package com.yjl.threads.chapter3;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 17:12
 **/
public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();

        for (int i = 0; i < 10; i++) {
            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....���߳�......." + i);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread("p1�߳�");
        p1.setPriority(1);
        PriorityThread p2 = new PriorityThread("p2�߳�");
        PriorityThread p3 = new PriorityThread("p3�߳�");
        p3.setPriority(10);


        p1.start();
        p2.start();
        p3.start();


    }
}


