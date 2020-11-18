package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numString = "2020.125";
        System.out.println("Number as string = " + numString);

        double num = Double.parseDouble(numString);
        System.out.println("Number = " + num);

        numString += 1;
        num += 1;

        System.out.println("Number as string = " + numString);
        System.out.println("Number = " + num);
    }
}
