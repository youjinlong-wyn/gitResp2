package com.yjl.threads.chapter2;

import java.math.BigDecimal;

/**
 * �������ְ�� TODO
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
                System.out.println("����ǰ����ǣ�" + currentMoney + "," + threadName + "��ȡ��1000��ȡ��������" + bankCard.getMoney());
            } else {
                System.out.println("���㣬��Ͻ���Ǯ");
                i--;
            }

        }

    }
}


