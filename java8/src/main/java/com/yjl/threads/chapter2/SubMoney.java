package com.yjl.threads.chapter2;

import java.math.BigDecimal;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:08
 **/
public class SubMoney implements Runnable {

    private BankCard bankCard;

    public SubMoney(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            BigDecimal currentMoney = bankCard.getMoney();
            if (currentMoney.compareTo(new BigDecimal(1000)) >= 0) {
                bankCard.setMoney(currentMoney.subtract(new BigDecimal(1000)));
                String threadName = Thread.currentThread().getName();
                Long threadId = Thread.currentThread().getId();
                System.out.println("操作前余额是：" + currentMoney + "," + threadName + "，取了1000，取完后余额是" + bankCard.getMoney());
            } else {
                System.out.println("余额不足，请赶紧存钱");
                i--;
            }

        }

    }
}


