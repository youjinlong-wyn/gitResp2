package com.yjl.designpattern.abstractfactory;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:42
 **/
public class KfcFactory implements Factory {

    public Drink getDrink() {
        return new Cola();
    }

    public Food getFood() {
        return new Hamburger();
    }
}


