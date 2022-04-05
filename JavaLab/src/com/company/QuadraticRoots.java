package com.company;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a, b and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double discriminant = (b * b) - 4 * a * c;
        if(discriminant < 0){
            System.out.println("There are no real roots. ");
        }
        else if(discriminant == 0){
            double x =  (-b)/2*a;
            System.out.println("Real and equal roots and the root is : " + x);
        }
        else{
            double x =  ( -b + Math.sqrt(discriminant) )/ 2*a;
            double x2 = ( -b - Math.sqrt(discriminant) )/ 2*a;

            System.out.println("Two roots are : "+ x + " " + x2);
        }
    }
}
