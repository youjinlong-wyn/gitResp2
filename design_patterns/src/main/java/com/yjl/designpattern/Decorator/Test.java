package com.yjl.designpattern.Decorator;

import com.yjl.designpattern.Decorator.coffee.Beverage;
import com.yjl.designpattern.Decorator.coffee.DarkRoast;
import com.yjl.designpattern.Decorator.condiment.Condiment;
import com.yjl.designpattern.Decorator.condiment.Milk;
import com.yjl.designpattern.Decorator.condiment.Mocha;
import com.yjl.designpattern.Decorator.condiment.Soy;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:44
 **/
public class Test {

    public static void main(String[] args) {
        Beverage b1 = new DarkRoast();
        Condiment b2 = new Milk(b1);
        Condiment b3 = new Soy(b2);
        Condiment b4 = new Mocha(b3);
        Condiment b5 = new Milk(b4);


        System.out.println(b5.getDesc() + ":  " + b5.cost());


    }

}


