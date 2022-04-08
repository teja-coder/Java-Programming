package com.company;

// 6. Write a program to demonstrate Function Overloading

public class FunctionOverloading {
    public static void main(String[] args) {
        main(1.2f,1.3f,2.2f);
        main(1,2);
        main("Irfan ","Teja");
    }

    public static void main(float a,float b,float c) {

        System.out.println("Main float Sum is " + (a+b+c));
    }

    public static void main(int a,int b) {
        System.out.println("Main int Sum is " + (a+b));
    }

    public static void main(String s1,String s2) {
        System.out.println("Main String concatenation " + s1+s2);
    }
}
