package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 15:59
 **/
public interface ComputerBuilder {

    void setCpu();

    void setGpu();

    void setMemory();

    void setHd();

    Computer build();

}


