package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//
//        while (true) {
//            int order = counter + 1;
//            System.out.println("Enter number # " + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int num = scanner.nextInt();
//                counter++;
//                sum += num;
//                if (counter == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//        System.out.println("Total: " + sum);

        Scanner scanner = new Scanner(System.in);
        int numEntered = 1;
        int sum = 0;
        int num;

        while (numEntered <= 10) {
            System.out.println("Enter number #" + numEntered);
            boolean hasNext = scanner.hasNextInt();
            if (hasNext) {
                num = scanner.nextInt();
                sum += num;
                numEntered++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Total: " + sum);
    }
}