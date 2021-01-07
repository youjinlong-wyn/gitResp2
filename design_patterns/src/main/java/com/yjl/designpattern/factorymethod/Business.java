package com.yjl.designpattern.factorymethod;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:45
 **/
public class Business {

    public static void taste(FoodFactory ff) {

        ff.getFood().eat();

    }

}


