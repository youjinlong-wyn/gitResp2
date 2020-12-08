package com.yjl.designpattern.abstractfactory.drink;

import com.yjl.designpattern.abstractfactory.drink.Drink;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 23:40
 **/
public class Cola implements Drink {

    public void drink() {
        System.out.println("喝可乐");
    }
}


