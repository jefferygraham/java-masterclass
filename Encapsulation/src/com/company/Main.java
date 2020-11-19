package com.company;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Jeff", 200, "Sword");
        System.out.println("Initial health: " + player.getHealth());

//        Player player = new Player();
//        player.name = "Jeff";
//        player.health = 20;
//        player.weapon = "Glock";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Health left: " + player.remainingHealth());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Health left: " + player.remainingHealth());

    }
}
