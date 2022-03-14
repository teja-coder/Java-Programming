package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i] = input.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
    }
}
