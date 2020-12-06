package com.yjl.designpattern.Decorator.condiment;

import com.yjl.designpattern.Decorator.coffee.Beverage;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:38
 **/
public abstract class Condiment extends Beverage {

    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        super("调料");
        this.beverage = beverage;
    }

    public double cost() {
        return 0;
    }
}


