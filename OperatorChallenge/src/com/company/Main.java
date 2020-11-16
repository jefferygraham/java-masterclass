package com.company;

public class Main {

    public static void main(String[] args) {

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double result = (firstVariable + secondVariable) * 100.00d;

        double remainder = result % 40.00d;

        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
