package com.yjl.threads.chapter2;

import com.yjl.threads.chapter1.MyRunnable;
import com.yjl.threads.chapter1.TickedWin;

/**
 * 描述类的职责 TODO
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
            synchronized (object) { // 或者 this
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
    }

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "卖票窗口1");
        Thread t2 = new Thread(ticket, "卖票窗口2");
        Thread t3 = new Thread(ticket, "卖票窗口3");
        Thread t4 = new Thread(ticket, "卖票窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


