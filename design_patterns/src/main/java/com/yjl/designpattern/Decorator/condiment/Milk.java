package com.yjl.designpattern.Decorator.condiment;

import com.yjl.designpattern.Decorator.coffee.Beverage;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:40
 **/
public class Milk extends Condiment {

    public Milk(Beverage beverage) {
        super(beverage);
    }


    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " 牛奶";
    }
}


