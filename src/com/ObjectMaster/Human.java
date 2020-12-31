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

    public int getIntelligence() {
        return intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void attack(Human h){
        h.health -= this.strength;
    }




}
