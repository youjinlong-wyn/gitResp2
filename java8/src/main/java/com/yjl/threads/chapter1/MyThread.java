package com.yjl.threads.chapter1;

/**
 * �������ְ�� TODO
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
            //��һ�֣�ͨ��this��ȡ�����ֱ���̳�thread��
            //String threadName = this.getName();
            //Long threadId = this.getId();

            //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();


            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....���߳�......." + i);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("�ҵ����߳�1");
        //thread.setName("�ҵ����߳�1");
        //���߳�ִ��
        thread.start();


        MyThread thread2 = new MyThread("�ҵ����߳�2");
        //thread2.setName("�ҵ����߳�2");
        //���߳�ִ��
        thread2.start();

        //main�߳�ִ��
        for (int i = 0; i < 50; i++) {
            System.out.println("-------------------------------���߳�---" + i);
        }
    }

}


