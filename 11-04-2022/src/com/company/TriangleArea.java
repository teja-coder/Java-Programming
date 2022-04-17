package com.company;

public class TriangleArea {
    public static void main(String[] args) {
        RightAngledTriangle obj = new RightAngledTriangle(3.0,4.0,5.0);
        obj.displayArea();
    }
}
class Triangle {
    double a,b,c,area;
    Triangle(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void calcArea() {
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is " + area);
    }
}
class RightAngledTriangle extends Triangle {
    double b,h;
    RightAngledTriangle(double a,double b,double c) {
        super(a,b,c);
        this.b = a;
        this.h = b;
    }
    void calcArea() {
        area = 0.5*b*h;
        System.out.println("Area of right angled triangle is " + area);
    }
    void displayArea() {
        super.calcArea();
        calcArea();
    }
}
