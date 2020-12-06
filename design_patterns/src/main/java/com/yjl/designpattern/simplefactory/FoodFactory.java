package com.yjl.designpattern.simplefactory;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 21:03
 **/
public class FoodFactory {

    public static Food getFood(int n) {
        Food food = null;
        switch (n) {
            case 1:
                food = new Hamburger();
                break;
            case 2:
                food = new RiceNoodles();
                break;
            case 3:
                food = new Lp();
                break;
        }

        return food;

    }

}


