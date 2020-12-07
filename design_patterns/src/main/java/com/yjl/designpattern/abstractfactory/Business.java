package com.yjl.designpattern.abstractfactory;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 22:45
 **/
public class Business {

    public static void taste(Factory ff) {

        ff.getFood().eat();

        ff.getDrink().drink();

    }

}


