package com.company;

public class Main {

    public static void main(String[] args) {

       char value = 'b';
       switch (value) {
           case 'A':case 'B':case 'C':case 'D':case 'E':
               System.out.println(value + " was found!");
               break;
           default:
               System.out.println("Not found!");
               break;
       }


    }
}
