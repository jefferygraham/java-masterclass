package com.company;

public class Main {

    public static void main(String[] args) {
        //byte-8 (1 byte) X
        //short-16 (2 byte) X
        //int-32 (4 byte) *
        //long-64 (8 byte) **
        //float-32 (4 byte) X
        //double-64 (8 byte) *
        //char-16 (2 byte) **
        //boolean (1 bit) *

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A92020";
        System.out.println(myString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println(lastString);
    }
}
