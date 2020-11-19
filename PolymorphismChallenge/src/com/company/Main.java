package com.company;

class Car {

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car startEngine() -> starting car");
    }

    public void accelerate() {
        System.out.println("Car accelerate() -> accelerating car");
    }

    public void brake() {
        System.out.println("Car brake() -> stopping car");
    }
}

class Benz extends Car {
    public Benz() {
        super("Benz", 8);
    }

    public void startEngine() {
        System.out.println("Benz startEngine() -> starting Benz");
    }

    public void accelerate() {
        System.out.println("Benz accelerate() -> accelerating Benz");
    }

    public void brake() {
        System.out.println("Benz brake() -> stopping Benz");
    }
}

class Maserati extends Car {
    public Maserati() {
        super("Maserati", 12);
    }

    @Override
    public void startEngine() {
        System.out.println("Maserati startEngine() -> starting Maserati");
    }

    @Override
    public void accelerate() {
        System.out.println("Maserati accelerate() -> accelerating Maserati");
    }

    @Override
    public void brake() {
        System.out.println("Maserati brake() -> stopping Maserati");
    }
}

class Cadillac extends Car {
    public Cadillac() {
        super("Cadillac", 6);
    }

    public void startEngine() {
        System.out.println("Cadillac startEngine() -> starting Cadillac");
    }

    public void accelerate() {
        System.out.println("Cadillac accelerate() -> accelerating Cadillac");
    }

    public void brake() {
        System.out.println("Cadillac brake() -> stopping Cadillac");
    }
}

class Junker extends Car {
    public Junker() {
        super("Junker", 4);
    }
}


public class Main {

    public static void main(String[] args) {
        Benz benz = new Benz();
        System.out.println(benz.getName());
        benz.startEngine();
        benz.accelerate();
        benz.brake();

        Junker junker = new Junker();
        System.out.println(junker.getName());
        junker.startEngine();
        junker.accelerate();
        junker.brake();
    }
}
