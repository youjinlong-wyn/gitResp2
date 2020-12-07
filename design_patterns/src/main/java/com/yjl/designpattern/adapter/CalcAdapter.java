package com.yjl.designpattern.adapter;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-07 22:42
 **/
public class CalcAdapter extends Calc {

    private Calc calc;


    public CalcAdapter(Calc calc) {
        this.calc = calc;
    }

    public int add(int a, int b, int c) {
        return calc.add(calc.add(a, b), c);
    }
}


