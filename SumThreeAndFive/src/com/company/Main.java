package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i + " is divisible by 3 & 5.");
                if(count == 5) {
                    System.out.println("Exiting loop");
                    System.out.println("Sum of numbers is: " + sum);
                    break;
                }
            }
        }
    }
}
