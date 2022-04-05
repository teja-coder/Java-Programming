package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum2 = sum(a,b);
        System.out.print("Enter 3 numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum3 = sum(n1,n2,n3);
        System.out.println("The sum of " + a + " and " + b + " is " + sum2);
        System.out.println("The sum of " + n1 + ", " + n2 + ", " + n3 + " is " + sum3);
    }
    static int sum(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
