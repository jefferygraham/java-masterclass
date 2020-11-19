package com.company;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
        Dog dog = new Dog("Rottweiler", 8, 20, 2, 4, 1, 20, "short silky");
//        dog.eat();
////        dog.walk();
//        dog.run();

        Fish fish = new Fish("Guppy", 5, 10, 2, 2, 3);
        fish.move(5);
    }
}
