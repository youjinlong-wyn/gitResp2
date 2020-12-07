package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 16:07
 **/
public class Test {

    public static void main(String[] args) {


        Director director = new Director();

        A_ComputerBuilder acb = new A_ComputerBuilder();
        Computer a = director.bulid(acb);
        System.out.println(a);

        B_ComputerBuilder bcb = new B_ComputerBuilder();
        Computer b = director.bulid(bcb);
        System.out.println(b);

        C_ComputerBuilder ccb = new C_ComputerBuilder();
        Computer c = director.bulid(ccb);
        System.out.println(c);


    }

}


