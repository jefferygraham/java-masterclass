package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Score is less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Score is less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score: " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score: " + finalScore);
        }
    }
}
