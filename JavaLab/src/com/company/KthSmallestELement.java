package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestELement {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print("The kth smallest element: " + arr[k]);
    }
}
