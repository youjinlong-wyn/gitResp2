package com.yjl.threads.chapter4;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 15:47
 **/
public class Ticket implements Runnable {
    private static Integer ticketNum = 100;


    @Override
    public void run() {
        while (true) {
            if (!saleTicket3()) {
                break;
            }
        }
    }

    //ͬ������ ������this
    // ��̬ͬ�������������� Ticket.class
    public synchronized boolean saleTicket() {
        if (ticketNum <= 0) {
            return false;
        }
        //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();
        System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....��Ʊ......." + ticketNum);
        ticketNum--;
        return true;
    }

    // ��̬ͬ�������������� Ticket.class
    public synchronized static boolean saleTicket2() {
        if (ticketNum <= 0) {
            return false;
        }
        //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();
        System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....��Ʊ......." + ticketNum);
        ticketNum--;
        return true;
    }

    // ��̬ͬ�������������� Ticket.class
    public static boolean saleTicket3() {
        synchronized (Ticket.class) {
            if (ticketNum <= 0) {
                return false;
            }
            //�ڶ���ʹ��Thread.currentThread()��ȡ��ǰ�߳�
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("�߳�����=" + threadName + "���߳�id=" + threadId + ".....��Ʊ......." + ticketNum);
            ticketNum--;
            return true;
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


