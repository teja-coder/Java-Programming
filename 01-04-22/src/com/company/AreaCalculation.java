package com.company;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double r = in.nextDouble();
        double areaCircle = area(r);
        System.out.print("Enter length and breadth of rectangle : ");
        int l = in.nextInt();
        int b = in.nextInt();
        int areaRectangle = area(l,b);
        System.out.print("Enter side of square : ");
        int s = in.nextInt();
        int areaSquare = area(s);
        System.out.println("The area of circle is " + areaCircle);
        System.out.println("The area of rectangle is " + areaRectangle);
        System.out.println("The area of Square is " + areaSquare);
    }
    static double area(double r) {
        return 3.14*r*r;
    }
    static int area(int l,int b) {
        return l*b;
    }
    static int area(int s) {
        return s*s;
    }
}
