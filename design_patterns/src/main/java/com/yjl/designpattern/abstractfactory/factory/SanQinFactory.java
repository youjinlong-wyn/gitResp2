package com.yjl.designpattern.abstractfactory.factory;

import com.yjl.designpattern.abstractfactory.Factory;
import com.yjl.designpattern.abstractfactory.drink.Drink;
import com.yjl.designpattern.abstractfactory.drink.IcdPeak;
import com.yjl.designpattern.abstractfactory.food.Food;
import com.yjl.designpattern.abstractfactory.food.Lp;

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


