package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteVal = 10;

        short myShortVal = 20;

        int myIntVal = 50;

        long myLongVal = 50000L + (10L * (myByteVal + myShortVal + myIntVal));
        System.out.println(myLongVal);
    }
}
