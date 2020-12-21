package com.yjl.threads.chapter5;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 10:32
 **/

public class BankCard {

    private BigDecimal amount = BigDecimal.ZERO;


    private boolean flag = true; // true 标识可以存钱， false标识可以取钱

    /**
     * 加钱
     *
     * @param money
     * @return void
     * @author jlyou
     * @date 2020/12/21 10:35
     **/
    public synchronized void addMoney(BigDecimal money) {
        // false标识可以取钱,不能存钱
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        BigDecimal tempAmount = new BigDecimal(amount.intValue());

        amount = amount.add(money);

        String threadName = Thread.currentThread().getName();
        System.out.println("操作前余额是：" + tempAmount + "," + threadName + "，存了1000，存完后余额是" + amount);

        flag = false;//通知取钱
        this.notifyAll();
    }

    /**
     * 减钱
     *
     * @param money
     * @return void
     * @author jlyou
     * @date 2020/12/21 10:35
     **/
    public synchronized  void subMoney(BigDecimal money) {

        // true 标识可以存钱， 不能取钱
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        BigDecimal tempAmount = new BigDecimal(amount.intValue());
        amount = amount.subtract(money);
        String threadName = Thread.currentThread().getName();
        System.out.println("操作前余额是：" + tempAmount + "," + threadName + "，取了1000，存完后余额是" + amount);
        flag = true;//通知存钱
        this.notifyAll();

    }

}
