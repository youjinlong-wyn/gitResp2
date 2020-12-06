package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 16:05
 **/
public class A_ComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    public void setCpu() {
        computer.setCpu("A");
    }

    public void setGpu() {
        computer.setGpu("A");
    }

    public void setMemory() {
        computer.setMemory("A");
    }

    public void setHd() {
        computer.setHd("A");
    }

    public Computer build() {
        return computer;
    }
}


