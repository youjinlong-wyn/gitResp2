package com.yjl.threads.chapter1;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 15:33
 **/
public class MyRunnable implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            //ʹ��Thread.currentThread()��ȡ��ǰ�߳�
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....���߳�......." + i);
        }

    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable, "�ҵ����߳�");
        t1.start();

        //main�߳�ִ��
        for (int i = 0; i < 50; i++) {
            System.out.println("-------------------------------���߳�---" + i);
        }

    }
}


