package com.yjl.designpattern.abstractfactory;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-05 21:09
 **/
public class Test {

    public static void main(String[] args) {
        Factory ff =  new KfcFactory();
       Business.taste(ff);
    }

}


