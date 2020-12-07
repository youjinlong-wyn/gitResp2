package com.yjl.designpattern.simplefactory;

/**
 * 简单工厂方法
 *
 * @author: jlyou
 * @date: 2020-12-05 21:09
 **/
public class Test {

    public static void main(String[] args) {
        Food food = FoodFactory.getFood(1);
        food.eat();
    }

}


