package com.yjl.threads.chapter2;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:11
 **/
public class TestBankCard {

    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        AddMoney addMoney = new AddMoney(bankCard);
        SubMoney subMoney = new SubMoney(bankCard);

        Thread chenchen = new Thread(addMoney, "����");
        Thread bingbing = new Thread(subMoney, "����");

        chenchen.start();
        bingbing.start();

    }
}


