package com.profo.kennel;

public class Kennel {
    public static void main(String[] args) {
        // Create three dog objects
        Dog dog1 = new Dog("Buddy", 20.0, "Alice", "123 Park Lane");
        Dog dog2 = new Dog("Max", 45.0, "Bob", "456 Elm Street");
        Dog dog3 = new Dog("Charlie", 55.0, "Carol", "789 Oak Avenue");

        // Each dog speaks and outputs results
        System.out.println("Dog 1 says: " + dog1.speak());
        System.out.println("Dog 2 says: " + dog2.speak());
        System.out.println("Dog 3 says: " + dog3.speak());

        // Actions: Dog 1 poops 5, Dog 3 eats 10
        dog1.poop(5.0);
        dog3.eat(10.0);

        // Each dog speaks again and outputs results
        System.out.println("After actions:");
        System.out.println("Dog 1 says: " + dog1.speak());
        System.out.println("Dog 2 says: " + dog2.speak());
        System.out.println("Dog 3 says: " + dog3.speak());
    }
}