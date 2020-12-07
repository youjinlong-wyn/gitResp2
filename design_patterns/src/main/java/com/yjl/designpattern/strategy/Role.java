package com.yjl.designpattern.strategy;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-07 23:41
 **/
public class Role {

    private Weapon weapon;

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.attack();
    }

}


