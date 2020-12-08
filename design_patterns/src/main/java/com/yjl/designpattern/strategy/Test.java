package com.yjl.designpattern.strategy;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-07 23:45
 **/
public class Test {

    public static void main(String[] args) {
        Role r = new Role("骑士");
        r.setWeapon(new Sword());
        r.fight();

        r.setWeapon(new Aex());
        r.fight();

        r.setWeapon(new Bow());
        r.fight();
    }

}


