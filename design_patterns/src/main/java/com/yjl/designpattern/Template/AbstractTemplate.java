package com.yjl.designpattern.Template;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 21:11
 **/
public abstract class AbstractTemplate {

    public abstract void code1();

    public abstract void code2();


    public void template() {
        System.out.println("-------开始-------");


        System.out.println("业务逻辑1");
        code1();

        System.out.println("业务逻辑2");
        code2();


        System.out.println("-------结束-------");

    }

}


