package com.yjl.designpattern.abstractfactory;

import com.yjl.designpattern.abstractfactory.factory.KfcFactory;

/**
 * 抽象工厂
 *
 * @author: jlyou
 * @date: 2020-12-05 21:09
 **/
public class Test {

    public static void main(String[] args) {
        Factory ff = new KfcFactory();
        Business.taste(ff);
    }

}


