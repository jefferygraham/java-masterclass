package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(157));;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = ((feet * 12 ) + inches) * 2.54d;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) (inches / 12d);
            double leftOverInches = (int) inches % 12d;
            return calcFeetAndInchesToCentimeters(feet,leftOverInches);
        } else {
            return -1;
        }
    }
}
