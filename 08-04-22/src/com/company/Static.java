package com.company;

// 4. Write a program to demonstrate static variables,methods and blocks

public class Static {
    public static void main(String[] args) {
        Car.displayDetails();
    }
}

class Car {
    static int noOfWheels;
    static String fuelType;
    static {
        noOfWheels = 4;
        fuelType = "Petrol";
    }
    static void displayDetails() {
        System.out.println("No of wheels : " + noOfWheels);
        System.out.println("Fuel Type : " + fuelType);
    }
}