package com.yjl.designpattern.abstractfactory;

import com.yjl.designpattern.abstractfactory.drink.Drink;
import com.yjl.designpattern.abstractfactory.food.Food;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 21:03
 **/
public interface Factory {

    public Food getFood();

    public Drink getDrink();

}


