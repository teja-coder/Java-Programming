package com.company;

import java.util.Scanner;

public class NegativeMoveToEnd {
    public static void main(String[] args) {
        System.out.println("Enter the n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0, j = 0; i < n; i++) {
            if(arr[i] < 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println("The new array is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
