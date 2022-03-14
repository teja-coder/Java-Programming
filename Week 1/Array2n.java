package com.company;

import java.util.Scanner;

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
