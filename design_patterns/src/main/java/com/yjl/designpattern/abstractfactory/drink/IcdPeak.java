package com.yjl.designpattern.abstractfactory.drink;

import com.yjl.designpattern.abstractfactory.drink.Drink;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 23:41
 **/
public class IcdPeak implements Drink {
    public void drink() {
        System.out.println("喝冰封");
    }
}


