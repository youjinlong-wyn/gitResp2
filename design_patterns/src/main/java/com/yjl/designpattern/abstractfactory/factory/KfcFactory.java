package com.yjl.designpattern.abstractfactory.factory;

import com.yjl.designpattern.abstractfactory.Factory;
import com.yjl.designpattern.abstractfactory.drink.Cola;
import com.yjl.designpattern.abstractfactory.drink.Drink;
import com.yjl.designpattern.abstractfactory.food.Food;
import com.yjl.designpattern.abstractfactory.food.Hamburger;

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


