package com.company;

public class SuperMembers {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.showColor();
    }
}

class Vehicle {
    String color = "white";
}

class Car extends Vehicle {
    String color = "black";
    void showColor() {
        System.out.println("Vehicle color is " + super.color);
        System.out.println("Car color is " + color);
    }
}