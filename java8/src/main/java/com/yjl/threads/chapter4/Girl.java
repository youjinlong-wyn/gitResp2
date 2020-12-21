package com.yjl.threads.chapter4;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 00:27
 **/
public class Girl extends  Thread {

    @Override
    public void run() {
        synchronized (MyLock.b) {
            System.out.println("女孩拿到了b锁");
            synchronized (MyLock.a) {
                System.out.println("女孩拿到了a锁");
                System.out.println("可以吃东西了");
            }
        }

    }
}


