package com.yjl.designpattern.Decorator.coffee;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:36
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("焦糖咖啡");
    }

    public double cost() {
        return 1.5;
    }
}


