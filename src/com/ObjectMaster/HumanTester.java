package com.ObjectMaster;

public class HumanTester {
    public static  void main(String[] args){
        Human shatha = new Human();
        Human tareq = new Human();
        shatha.attack(tareq);
        shatha.attack(tareq);
        System.out.println(tareq.getHealth());


    }
}
