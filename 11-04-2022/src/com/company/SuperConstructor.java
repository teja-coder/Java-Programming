package com.company;

import java.util.Arrays;

public class SuperConstructor {
    public static void main(String[] args) {
        Square s1 = new Square();
    }
}

class Shape {
    Shape() {
        System.out.println("A shape is created");
    }
    Shape(int... a) {
        System.out.println("The dimensions of shape are " + Arrays.toString(a));
    }
}

class Square extends Shape {
    Square() {
        super(1,2,3);
        System.out.println("A square is created");
    }
}