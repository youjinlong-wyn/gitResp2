package com.yjl.designpattern.abstractfactory.food;

import com.yjl.designpattern.abstractfactory.food.Food;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 21:00
 **/
public class Hamburger implements Food {

    public void eat() {
        System.out.println("吃汉堡包...");
    }
}


