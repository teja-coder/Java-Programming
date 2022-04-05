package com.company;

import java.util.Scanner;

public class MatrixDiagnol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        int[] matrix = new int[n*n];
        System.out.print("Enter matrix elements : ");
        for (int i = 0; i < n*n; i++) {
            matrix[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[n*i+i]);
        }
    }
}
