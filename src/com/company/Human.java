package com.company;

/**
 * Created by summer on 2017/4/5.
 */
public class Human extends Animal {
    @Override
    public void cry() {
        System.out.println("human cry...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("human eating...");
    }
}
