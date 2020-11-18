package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125 ));
        System.out.println(sumDigits(-125 ));
        System.out.println(sumDigits(4 ));
        System.out.println(sumDigits(32123 ));
    }

    public static int sumDigits(int num) {
//        int sum = 0;
//        if (num >= 10) {
//            while (num >= 10) {
//                sum += num % 10;
//                num = num / 10;
//            }
//        } else {
//            return num;
//        }
//        return sum + num;
        if (num < 10) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
