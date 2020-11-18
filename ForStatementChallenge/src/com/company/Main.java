package com.company;

public class Main {

    public static void main(String[] args) {

        int primesFound = 0;
        for(int i = 1; i < 50; i++) {
            if(isPrime(i)) {
                primesFound++;
                System.out.println(i + " is a prime");
                if (primesFound == 3) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
