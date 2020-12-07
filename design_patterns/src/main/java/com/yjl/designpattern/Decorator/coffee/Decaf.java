package com.yjl.designpattern.Decorator.coffee;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:34
 **/
public class Decaf extends Beverage {

    public Decaf() {
        super("无咖啡因咖啡");
    }

    public double cost() {
        return 1;
    }
}


