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


    private boolean flag = true; // true ��ʶ���Դ�Ǯ�� false��ʶ����ȡǮ

    /**
     * ��Ǯ
     *
     * @param money
     * @return void
     * @author jlyou
     * @date 2020/12/21 10:35
     **/
    public synchronized void addMoney(BigDecimal money) {
        // false��ʶ����ȡǮ,���ܴ�Ǯ
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
        System.out.println("����ǰ����ǣ�" + tempAmount + "," + threadName + "������1000������������" + amount);

        flag = false;//֪ͨȡǮ
        this.notifyAll();
    }

    /**
     * ��Ǯ
     *
     * @param money
     * @return void
     * @author jlyou
     * @date 2020/12/21 10:35
     **/
    public synchronized  void subMoney(BigDecimal money) {

        // true ��ʶ���Դ�Ǯ�� ����ȡǮ
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
        System.out.println("����ǰ����ǣ�" + tempAmount + "," + threadName + "��ȡ��1000������������" + amount);
        flag = true;//֪ͨ��Ǯ
        this.notifyAll();

    }

}
