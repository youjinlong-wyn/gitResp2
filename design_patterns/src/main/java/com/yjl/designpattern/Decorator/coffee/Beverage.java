package com.yjl.designpattern.Decorator.coffee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 20:31
 **/
@ToString
@Setter
@Getter
public abstract class Beverage {
    private String desc;

    public abstract double cost();

    public Beverage(String desc) {
        this.desc = desc;
    }
}
