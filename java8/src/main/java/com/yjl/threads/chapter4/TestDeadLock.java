package com.yjl.threads.chapter4;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 00:27
 **/
public class TestDeadLock {
    public static void main(String[] args) throws InterruptedException {
        Boy boy = new Boy();
        Girl girl = new Girl();
        boy.start();
        girl.start();

    }

}


