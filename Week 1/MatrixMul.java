//package com.company;
//
//import java.util.Scanner;
//
//public class MatrixMul {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[][] a = new int[5][5];
//        int[][] b = new int[5][5];
//        int[][] c = new int[5][5];
//        System.out.println("Matrix A");
//        System.out.print("Enter rows : ");
//        int r1 = input.nextInt();
//        System.out.print("Enter cols : ");
//        int c1 = input.nextInt();
//        System.out.println("Matrix A Elements");
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c1; j++) {
//                a[i][j] = input.nextInt();
//            }
//        }
//        System.out.println("Matrix B");
//        System.out.print("Enter rows : ");
//        int r2 = input.nextInt();
//        System.out.print("Enter cols : ");
//        int c2 = input.nextInt();
//        System.out.println("Matrix B Elements");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                b[i][j] = input.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                for(int k=0;k<n;k++){
//                    c[i][j] += a[i][k] * b[k][j];
//                }
//            }
//        }
//        System.out.println("The multiplied matrix is");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(c[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
