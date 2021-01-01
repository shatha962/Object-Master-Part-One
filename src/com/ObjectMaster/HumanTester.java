package com.ObjectMaster;

public class HumanTester {
    public static  void main(String[] args){
        Human shatha = new Human();
        Human tareq = new Human();
        Samurai omar = new Samurai();
        Ninja amal = new Ninja();
        Wizard diana = new Wizard();
        shatha.attack(tareq);
        shatha.attack(tareq);
        amal.runAway();
        amal.steal(tareq);
        diana.heal(tareq);
        diana.fireball(shatha);
        omar.meditate();
        omar.deathBlow(shatha);
        omar.howMany();
        System.out.println(diana.getHealth());
        System.out.println(shatha.getHealth());
        System.out.println(amal.getHealth());
        System.out.println(tareq.getHealth());


    }
}
