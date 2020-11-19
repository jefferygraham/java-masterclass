package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int velocity;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.velocity = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees");
    }

    public void move(int velocity, int direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.velocity + " at " + this.direction + " degrees.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void stop() {
        this.velocity = 0;

    }

    //    private String steering;
//    private int gears;
//
//    public Vehicle(String steering, int gears) {
//        this.steering = steering;
//        this.gears = gears;
//    }
//
//    public int upShift() {
//        return this.gears++;
//    }
//
//    public int downShift() {
//        return this.gears--;
//    }
//
//    public void move(int speed) {
//        System.out.println("Vehicle move() called at " + speed);
//    }

}
