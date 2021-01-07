package com.yjl.designpattern.factorymethod;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:42
 **/
public class HamburgerFactory implements FoodFactory {

    public Food getFood() {
        return new Hamburger();
    }
}


