package com.company;

public class Player {

    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth( int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //lives--
        }
    }

    public int remainingHealth() {
        return this.health;
    }
}
