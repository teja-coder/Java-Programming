package com.company;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vehicle car = new Vehicle();
        System.out.println("Enter car details");
        car.setName(in.next());
        car.setColor(in.next());
        car.setNoOfWheels(in.nextInt());
        String name = car.getName();
        String color = car.getColor();
        int noOfWheels = car.getNoOfWheels();
        System.out.println("Name: " + name + " Color: " + color + " No of wheels: " + noOfWheels);

        System.out.println("Enter bike details");
        Vehicle bike = new Vehicle();
        bike.setName(in.next());
        bike.setColor(in.next());
        bike.setNoOfWheels(in.nextInt());
        name = bike.getName();
        color = bike.getColor();
        noOfWheels = bike.getNoOfWheels();
        System.out.println("Name: " + name + " Color: " + color + " No of wheels: " + noOfWheels);

        System.out.println();
//        accessing car name
        System.out.println("The name of car is " + car.name);

        System.out.println();
//        modifying color attribute of car object
        car.color = "Blue";
        System.out.println("The color of car is " + car.color);

        System.out.println();
//        class method
        Vehicle.className();
    }
}

class Vehicle {
    String name,color;
    int noOfWheels;

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getNoOfWheels() {
        return noOfWheels;
    }

    static void className() {
        System.out.println("This is vehicle class");
    }
}
