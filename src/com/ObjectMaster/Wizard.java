package com.ObjectMaster;

public class Wizard extends Human{
    public Wizard(){
        this.setHealth(50);
        this.setIntelligence(8);
    }
    public void heal(Human h){
        h.setHealth(this.getIntelligence() + h.getHealth());
    }
    public void fireball(Human h){
        h.setHealth(h.getIntelligence() - this.getIntelligence()*3);
    }

}
