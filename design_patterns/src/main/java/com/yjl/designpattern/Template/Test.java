package com.yjl.designpattern.Template;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 21:14
 **/
public class Test {

    public static void main(String[] args) {
        AbstractTemplate t1 = new Busi1();
        t1.template();

        AbstractTemplate t2 = new Busi2();
        t2.template();
    }

}


