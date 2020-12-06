package com.yjl.designpattern.factorymethod;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:42
 **/
public class LPFactory implements FoodFactory {

    public Food getFood() {
        return new RiceNoodles();
    }
}


