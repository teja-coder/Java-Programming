package com.company;

//5. Write a program to demonstrate instance variables, methods and blocks

public class Instance {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.displayDetails();
    }
}

class Bike {
    String name,color;
    {
        name = "bullet";
        color = "black";
    }
    void displayDetails() {
        System.out.println("Name : " + name + " Color : " + color);
    }
}
