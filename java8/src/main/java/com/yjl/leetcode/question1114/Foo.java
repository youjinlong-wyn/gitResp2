package com.yjl.leetcode.question1114;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ������ͬ���߳̽��Ṳ��һ�� Foo ʵ����
 * <p>
 * �߳� A ������� first() ����
 * �߳� B ������� second() ����
 * �߳� C ������� third() ����
 * <p>
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/print-in-order
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 * @author: jlyou
 * @date: 2020-12-14 16:17
 **/
class Foo {
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (firstJobDone.get() != 1) {
            System.out.println("----�ȴ�  1  ִ��");
        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (secondJobDone.get() != 1) {
            System.out.println("----�ȴ�  2  ִ��");
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Runnable a = () -> System.out.println("first");
        Runnable b = () -> System.out.println("second");
        Runnable c = () -> System.out.println("third");


        Thread t1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                foo.first(a);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                foo.second(b);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                foo.third(c);
            }
        });

        int[] array = {1, 3, 2};

        for (int i = 0; i < array.length; i++) {
            if (1 == array[i]) {
                t1.start();
            }

            if (2 == array[i]) {
                t2.start();
            }
            if (3 == array[i]) {
                t3.start();
            }
        }

    }
}