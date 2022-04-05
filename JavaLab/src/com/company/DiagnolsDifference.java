package com.company;

import java.util.Scanner;

public class DiagnolsDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of matrix : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int d1=0, d2=0;
        for (int i = 0; i < n; i++) {
                d1+= arr[i][i];
                d2 += arr[n-(i + 1)][i];
        }

        System.out.println("The difference in diagnols is " + Math.abs(d2 - d1));
    }
}
