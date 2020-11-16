package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2: " + result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println(result);
        System.out.println(previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5; //20 / 5 = 4
        System.out.println(result);

        result = result % 3; //remainder of 4 / 3 = 1
        System.out.println(result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; //2 - 1 = 1
        System.out.println(result);

        result += 2; //1 + 2 = 3;
        System.out.println(result);

        result *= 10; //3 * 10 = 30
        System.out.println(result);

        result /= 3; //30 / 3 = 10;
        System.out.println(result);

        result -= 2; // 10 - 2 = 8
        System.out.println(result);
        
        boolean isAlien = false;
        
        if (isAlien == false) {
            System.out.println("Not an alien");
            System.out.println("And I'm scared");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than 2nd top score and less than top score!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
