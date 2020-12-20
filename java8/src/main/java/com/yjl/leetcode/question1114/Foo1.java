package com.yjl.leetcode.question1114;

import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 三个不同的线程将会共用一个 Foo 实例。
 * <p>
 * 线程 A 将会调用 first() 方法
 * 线程 B 将会调用 second() 方法
 * 线程 C 将会调用 third() 方法
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-in-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: jlyou
 * @date: 2020-12-14 16:17
 **/
class Foo1 {
    private Semaphore two = new Semaphore(0);
    private Semaphore three = new Semaphore(0);

    public Foo1() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        two.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        two.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        three.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
       three.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        three.release();
    }


    public static void main(String[] args) throws InterruptedException {
        Foo1 foo = new Foo1();

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

        int[] array = {3, 1, 2};

        for (int i = 0; i < array.length; i++) {
            if(1== array[i]){
                t1.start();
            }

            if(2== array[i]){
                t2.start();
            }
            if(3== array[i]){
                t3.start();
            }
        }

    }
}