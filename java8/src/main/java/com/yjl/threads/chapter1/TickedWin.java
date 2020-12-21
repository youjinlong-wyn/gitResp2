package com.yjl.threads.chapter1;

/**
 * 卖票窗口，每个窗口，卖100张票
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
            //第二种使用Thread.currentThread()获取当前线程
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....买票......." + ticketNum);
            ticketNum--;
        }
    }

    public static void main(String[] args) {
        TickedWin win1 = new TickedWin("卖票窗口1");
        TickedWin win2 = new TickedWin("卖票窗口2");
        TickedWin win3 = new TickedWin("卖票窗口3");
        TickedWin win4 = new TickedWin("卖票窗口4");

        win1.start();
        win2.start();
        win3.start();
        win4.start();

    }
}


