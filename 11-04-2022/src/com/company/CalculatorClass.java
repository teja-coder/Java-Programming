package com.company;

// Create a new class called Calculator with the following methods:
//A static method called powerInt(int num1,int num2) - This method should return num1 to the power num2.
//A static method called powerDouble(double num1,double num2) - This method should return num1 to the power num2
//Invoke both the methods and test the functionality. Also count the number of objects created.

import java.util.Scanner;

public class CalculatorClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 integers : ");
        double res1 = Calculator.powerInt(in.nextInt(),in.nextInt());
        System.out.println("The power of integers is " + res1);
        System.out.print("Enter 2 doubles : ");
        double res2 = Calculator.powerDouble(in.nextDouble(),in.nextDouble());
        System.out.println("The power of doubles is " + res2);
    }
}
class Calculator {
    static double powerInt(int num1,int num2) {
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1,double num2) {
        return Math.pow(num1,num2);
    }
}
