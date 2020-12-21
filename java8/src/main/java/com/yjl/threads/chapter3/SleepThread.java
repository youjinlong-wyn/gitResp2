package com.yjl.threads.chapter3;

import com.yjl.threads.chapter1.MyThread;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:56
 **/
public class SleepThread extends Thread {

    public SleepThread(String name) {
    }

    @Override
    public void run() {


        for (int i = 0; i < 10; i++) {
            //��һ�֣�ͨ��this��ȡ�����ֱ���̳�thread��
            //String threadName = this.getName();
            //Long threadId = this.getId();

            //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();


            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....���߳�......." + i);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        SleepThread thread = new SleepThread("�ҵ����߳�1");
        //thread.setName("�ҵ����߳�1");
        //���߳�ִ��
        thread.start();


        SleepThread thread2 = new SleepThread("�ҵ����߳�2");
        //thread2.setName("�ҵ����߳�2");
        //���߳�ִ��
        thread2.start();

    }
}


