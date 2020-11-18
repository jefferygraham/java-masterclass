package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int max = 0;
//        int min = 0;
//        boolean first = true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {

            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {

                int num = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = num;
//                    max = num;
//                }

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        scanner.close();
    }
}

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter number");
//        int num = scanner.nextInt();
//        scanner.nextLine();
//        int max = num;
//        int min = num;
//
//        while (true) {
//            System.out.println("Enter number");
//            boolean isInt = scanner.hasNextInt();
//
//            if(isInt) {
//                num = scanner.nextInt();
//                if (num > max) {
//                    max = num;
//                } else if (num < min) {
//                    min = num;
//                }
//            } else {
//                break;
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);
//        scanner.close();
//    }

