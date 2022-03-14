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
        int k = n;
        int c = 0;
        while(n-2>0){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.println("The fibonacci series  " + c);
    }

}
