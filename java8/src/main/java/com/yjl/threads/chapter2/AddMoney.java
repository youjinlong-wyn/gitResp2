package com.yjl.threads.chapter2;

import java.math.BigDecimal;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:04
 **/
public class AddMoney implements Runnable {

    private BankCard bankCard;

    public AddMoney(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void run() {

        BigDecimal currentMoney = bankCard.getMoney();

        for (int i = 0; i < 10; i++) {
            bankCard.setMoney(currentMoney.add(new BigDecimal(1000)));
            String threadName = Thread.currentThread().getName();
            Long threadId = Thread.currentThread().getId();
            System.out.println("操作前余额是：" + currentMoney + "," + threadName + "，存了1000，存完后余额是" + bankCard.getMoney());
        }
    }

}


