package com.company;

import java.util.Scanner;

// 11. Create a class Box that uses a parameterised constructor to initialise the dimensions of a box. The dimensions of the Box are width,height,depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
public class BoxClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width,height and depth of a box");
        Box boxObj = new Box(in.nextInt(),in.nextInt(), in.nextInt());
        int vol = boxObj.volume();
        System.out.print("The volume of the box is " + vol );
    }
}
class Box {
    int width,height,depth;
    Box(int width,int height,int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    int volume() {
        return width*height*depth;
    }
}
