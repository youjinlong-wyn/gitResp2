package com.yjl.threads.chapter4;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 00:25
 **/
public class Boy extends Thread {

    @Override
    public void run() {
        synchronized (MyLock.a) {
            System.out.println("男孩拿到了a锁");
            synchronized (MyLock.b) {
                System.out.println("男孩拿到了b锁");
                System.out.println("可以吃东西了");
            }

        }
    }
}


