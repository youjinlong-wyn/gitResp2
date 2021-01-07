package com.yjl.designpattern.factorymethod;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 21:09
 **/
public class Test {

    public static void main(String[] args) {
        FoodFactory ff = new HamburgerFactory();
        Business.taste(ff);
    }

}


