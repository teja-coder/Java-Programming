package com.company;

//7. Write a program to demonstrate COnstructor Overloading

public class ConstructorOverloading {
    public static void main(String[] args) {
        Vehicle auto = new Vehicle();
        Vehicle car = new Vehicle("Ferrari");
        Vehicle bike = new Vehicle("KTM","blue");
    }
}
class Vehicle {
    String brand,color;
    Vehicle() {
        System.out.println("This is vehicle class");
    }
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }
    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        System.out.println("Brand : " + brand + " Color : " + color);
    }
}