package com.company;

import java.util.Scanner;

public class NthMultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
