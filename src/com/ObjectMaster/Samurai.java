package com.ObjectMaster;

public class Samurai extends Human{
    public int count = 0;
        public Samurai(){
            this.setHealth(200);
            count += 1;
        }
        public void deathBlow(Human h){
            h.setHealth(0);
            this.setHealth(this.getHealth()/2);
        }
        public void meditate(){
            this.setHealth(this.getHealth() + this.getHealth()/2);
        }
        public int howMany(){
            return count;
        }
}
