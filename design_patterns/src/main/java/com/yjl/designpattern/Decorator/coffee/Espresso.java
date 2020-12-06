package com.yjl.designpattern.Decorator.coffee;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:35
 **/
public class Espresso extends Beverage {

    public Espresso() {
        super("浓缩咖啡");
    }

    public double cost() {
        return 2;
    }
}


