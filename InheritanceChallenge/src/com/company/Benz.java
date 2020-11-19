package com.company;

public class Benz extends Car {

    private int roadService;

    public Benz(int roadService) {
        super("E-Class", "4WD", 4, 4, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {

        int newVelocity = getVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getDirection());
        }
    }

    //    private String model;
//
//    public Benz(String steering, int gears, int wheels, String model) {
//        super(steering, gears, wheels);
//        this.model = model;
//    }
//
//    private void sunshadeOpen() {
//        System.out.println("Opening sun shade");
//    }
//
//    @Override
//    public void move(int speed) {
//        sunshadeOpen();
//        System.out.println("Benz move() called at " + speed);
//        super.move(35);
//    }

}
