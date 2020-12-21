package com.yjl.threads.chapter2;

import com.yjl.threads.chapter1.MyRunnable;
import com.yjl.threads.chapter1.TickedWin;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 15:47
 **/
public class Ticket implements Runnable {
    private Integer ticketNum = 100;

    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) { // ���� this
                if (ticketNum <= 0) {
                    break;
                }
                //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
                String threadName = Thread.currentThread().getName();
                Long threadId = Thread.currentThread().getId();
                System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....��Ʊ......." + ticketNum);
                ticketNum--;
            }
        }
    }

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "��Ʊ����1");
        Thread t2 = new Thread(ticket, "��Ʊ����2");
        Thread t3 = new Thread(ticket, "��Ʊ����3");
        Thread t4 = new Thread(ticket, "��Ʊ����4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


