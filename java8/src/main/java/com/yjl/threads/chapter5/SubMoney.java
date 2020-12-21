package com.yjl.threads.chapter5;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 10:39
 **/
public class SubMoney implements Runnable {

    private BankCard bankCard;

    public SubMoney(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bankCard.subMoney(new BigDecimal(1000));
        }
    }
}
