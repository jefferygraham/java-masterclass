package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Min Float Val: " + myMinFloatVal);
        System.out.println("Max Float Val: " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Min Double Val: " + myMinDoubleVal);
        System.out.println("Max Double Val: " + myMaxDoubleVal);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5.00 / 3.00;
        System.out.println("Int val: " + myIntVal);
        System.out.println("Float val: " + myFloatVal);
        System.out.println("Double val: " + myDoubleVal);

    }
}
