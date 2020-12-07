package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 16:05
 **/
public class C_ComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    public void setCpu() {
        computer.setCpu("C");
    }

    public void setGpu() {
        computer.setGpu("C");
    }

    public void setMemory() {
        computer.setMemory("C");
    }

    public void setHd() {
        computer.setHd("C");
    }

    public Computer build() {
        return computer;
    }
}


