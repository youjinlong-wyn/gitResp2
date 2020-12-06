package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 16:03
 **/
public class Director {

    public Computer bulid(ComputerBuilder cb) {
        cb.setCpu();
        cb.setGpu();
        cb.setMemory();
        cb.setHd();
        return cb.build();
    }

}


