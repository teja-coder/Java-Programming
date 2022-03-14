package com.company;

import java.util.Scanner;
// Given the array consisting of 2n elements in the form [x1,x2,x3......xn,y1,y2,y3......yn]
// Return the array in the form of [x1,y1,x2,y2...........xn,yn]
public class Array2n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        int[] arr = new int[2*n];
        int[] res = new int[2*n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<2*n;i++)
            arr[i] = input.nextInt();
        for(int i=0,j=n,k=0;i<n;i++,j++,k+=2) {
            res[k] = arr[i];
            res[k+1] = arr[j];
        }
        for(int i=0;i<2*n;i++)
            System.out.print(res[i]);
    }
}
