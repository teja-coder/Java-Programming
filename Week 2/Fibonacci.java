package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Non recursive
        int a = 1;
        int b = 1;
        System.out.print("Enter n : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        while(n>0){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.println(n + "th number of the fibonacci series is " + c);
    }

}
