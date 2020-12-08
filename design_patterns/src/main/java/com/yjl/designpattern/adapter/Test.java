package com.yjl.designpattern.adapter;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-07 22:44
 **/
public class Test {

    public static void main(String[] args) {
        Calc c = new Calc();

        CalcAdapter ad = new CalcAdapter(c);

        System.out.println(ad.add(1, 2, 3));
    }

}


