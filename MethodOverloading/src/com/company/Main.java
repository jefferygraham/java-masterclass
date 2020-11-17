package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Jeff", 500);
        System.out.println("new score: " + newScore);
        calculateScore(75);
        calculateScore();
    }
    
    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Anonymous player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }
    
}
