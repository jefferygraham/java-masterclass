package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count: " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count: " + count);
//            count++;
//        } while (count != 6);

        int num = 4;
        int endNum = 20;
        int evenNumsFound = 0;

        while (num <= endNum) {
            num++;
            if (!(isEvenNumber(num))) {
                continue;
            }
            evenNumsFound++;
            System.out.println("Even number: " + num);
            if (evenNumsFound == 5) {
                break;
            }
        }
        System.out.println("Found " + evenNumsFound + " even numbers");
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
