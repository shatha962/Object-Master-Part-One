package com.ObjectMaster;

public class Human {
    private int strength = 0;
    private int stealth = 0;
    private int intelligence = 0;
    private int health = 0;

    public Human(){
        this.health = 100;
        this.intelligence = 3;
        this.stealth = 3;
        this.strength = 3;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void attack(Human h){
        h.health -= this.strength;
    }
}
