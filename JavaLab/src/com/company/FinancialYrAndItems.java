package com.company;

import java.util.Scanner;

public class FinancialYrAndItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m and n values : ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int max=mat[0][0],maxItem=0,maxYear=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]>max){
                    max = mat[i][j];
                    maxItem = j;
                    maxYear = i;
                }
            }
        }
        System.out.println("The year with more demand is " + maxYear);
        System.out.println("The item with more demand is " + maxItem);
    }
}
