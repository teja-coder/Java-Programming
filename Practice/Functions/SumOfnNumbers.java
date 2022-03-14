package com.company.Functions;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is " + res);
    }
    static int sum(int n){
        int s = 0;
        for(int i=1;i<=n;i++)
            s += i;
        return s;
    }
}
