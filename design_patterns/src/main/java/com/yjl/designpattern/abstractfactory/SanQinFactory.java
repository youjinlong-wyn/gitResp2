package com.yjl.designpattern.abstractfactory;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:42
 **/
public class SanQinFactory implements Factory {

    public Food getFood() {
        return new Lp();
    }

    public Drink getDrink() {
        return new IcdPeak();
    }
}


