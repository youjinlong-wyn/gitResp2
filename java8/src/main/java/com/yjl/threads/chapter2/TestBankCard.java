package com.yjl.threads.chapter2;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:11
 **/
public class TestBankCard {

    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        AddMoney addMoney = new AddMoney(bankCard);
        SubMoney subMoney = new SubMoney(bankCard);

        Thread chenchen = new Thread(addMoney, "晨晨");
        Thread bingbing = new Thread(subMoney, "冰冰");

        chenchen.start();
        bingbing.start();

    }
}


