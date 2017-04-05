package com.company;


public class Main {

    public static void main(String[] args) {
	    // write your code here
        Animal a = new Human();
        a.cry();
        Animal b = new Animal() {
            @Override
            public void cry() {
                System.out.println("anyone cry");
            }
        };
        b.cry();
        LightA l = new LightA();
        //Light l = new LightA();  cant find l.flag??
        l.open();
        l.cutoff();
        System.out.println(l.flag);
    }
}
