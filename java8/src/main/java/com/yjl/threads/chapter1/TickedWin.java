package com.yjl.threads.chapter1;

/**
 * ��Ʊ���ڣ�ÿ�����ڣ���100��Ʊ
 *
 * @author: jlyou
 * @date: 2020-12-20 15:22
 **/
public class TickedWin extends Thread {

    private int ticketNum = 100;


    public TickedWin() {
        super();
    }

    public TickedWin(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
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

    public static void main(String[] args) {
        TickedWin win1 = new TickedWin("��Ʊ����1");
        TickedWin win2 = new TickedWin("��Ʊ����2");
        TickedWin win3 = new TickedWin("��Ʊ����3");
        TickedWin win4 = new TickedWin("��Ʊ����4");

        win1.start();
        win2.start();
        win3.start();
        win4.start();

    }
}


