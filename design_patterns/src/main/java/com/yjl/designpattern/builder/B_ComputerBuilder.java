package com.yjl.designpattern.builder;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 16:05
 **/
public class B_ComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    public void setCpu() {
        computer.setCpu("B");
    }

    public void setGpu() {
        computer.setGpu("B");
    }

    public void setMemory() {
        computer.setMemory("B");
    }

    public void setHd() {
        computer.setHd("B");
    }

    public Computer build() {
        return computer;
    }
}


