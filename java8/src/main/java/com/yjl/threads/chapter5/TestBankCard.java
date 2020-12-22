package com.yjl.threads.chapter5;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-21 10:42
 **/
public class TestBankCard {

    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        AddMoney addMoney = new AddMoney(bankCard);
        SubMoney subMoney = new SubMoney(bankCard);

        Thread chenchen = new Thread(addMoney, "³¿³¿");
        Thread bingbing = new Thread(subMoney, "±ù±ù");

        Thread xiaoming = new Thread(addMoney, "Ð¡Ã÷");
        Thread xiaohong = new Thread(subMoney, "Ð¡ºì");


        chenchen.start();
        bingbing.start();

        xiaoming.start();
        xiaohong.start();

    }

}
