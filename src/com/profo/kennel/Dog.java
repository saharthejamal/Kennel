package com.profo.kennel;

public class Dog {
    private String name;
    private double weight;
    private String owner;
    private String address;

    // Constructor
    public Dog(String name, double weight, String owner, String address) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.address = address;
    }

    // Poop method
    public void poop(double amount) {
        weight -= amount;
    }

    // Eat method
    public void eat(double amount) {
        weight += amount;
    }

    // Speak method
    public String speak() {
        if (weight < 25) {
            return "Yip yip";
        } else if (weight <= 50) {
            return "Bark";
        } else {
            return "Woof";
        }
    }

    // Getter for weight (optional)
    public double getWeight() {
        return weight;
    }
}
