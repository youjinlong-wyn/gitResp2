package com.yjl.threads.chapter4;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 00:25
 **/
public class Boy extends Thread {

    @Override
    public void run() {
        synchronized (MyLock.a) {
            System.out.println("�к��õ���a��");
            synchronized (MyLock.b) {
                System.out.println("�к��õ���b��");
                System.out.println("���ԳԶ�����");
            }

        }
    }
}


