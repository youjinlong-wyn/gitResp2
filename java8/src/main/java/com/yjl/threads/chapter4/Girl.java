package com.yjl.threads.chapter4;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 00:27
 **/
public class Girl extends  Thread {

    @Override
    public void run() {
        synchronized (MyLock.b) {
            System.out.println("Ů���õ���b��");
            synchronized (MyLock.a) {
                System.out.println("Ů���õ���a��");
                System.out.println("���ԳԶ�����");
            }
        }

    }
}


