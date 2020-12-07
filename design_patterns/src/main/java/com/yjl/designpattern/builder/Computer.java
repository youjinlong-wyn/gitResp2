package com.yjl.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 15:57
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Computer {
    private String cpu;
    private String gpu;
    private String memory;
    private String hd;
}


