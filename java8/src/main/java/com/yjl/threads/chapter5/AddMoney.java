package com.yjl.threads.chapter5;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 10:36
 **/
public class AddMoney implements Runnable {

    private BankCard bankCard;

    public AddMoney(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bankCard.addMoney(new BigDecimal(1000));
        }
    }
}
