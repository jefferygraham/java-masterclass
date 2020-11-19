package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car benz = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model: " + porsche.getModel());
    }
}
