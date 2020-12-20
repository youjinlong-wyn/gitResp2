package com.yjl.threads.chapter4;

/**
 * 描述类的职责 TODO
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

    //同步方法 锁的是this
    // 静态同步方法，锁的是 Ticket.class
    public synchronized boolean saleTicket() {
        if (ticketNum <= 0) {
            return false;
        }
        //第二种使用Thread.currentThread()获取当前线程
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();
        System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....买票......." + ticketNum);
        ticketNum--;
        return true;
    }

    // 静态同步方法，锁的是 Ticket.class
    public synchronized static boolean saleTicket2() {
        if (ticketNum <= 0) {
            return false;
        }
        //第二种使用Thread.currentThread()获取当前线程
        String threadName = Thread.currentThread().getName();
        Long threadId = Thread.currentThread().getId();
        System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....买票......." + ticketNum);
        ticketNum--;
        return true;
    }

    // 静态同步方法，锁的是 Ticket.class
    public static boolean saleTicket3() {
        synchronized (Ticket.class) {
            if (ticketNum <= 0) {
                return false;
            }
            //第二种使用Thread.currentThread()获取当前线程
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("线程名称=" + threadName + "，线程id=" + threadId + ".....买票......." + ticketNum);
            ticketNum--;
            return true;
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


