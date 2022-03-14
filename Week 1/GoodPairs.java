package com.company;

import java.util.Scanner;
// Given an array of integers nums, return the number of good pairs
// A pair (i,j) is said to be a good pair if nums[i]==nums[j] and i<j
public class GoodPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
            nums[i] = input.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("(" + i + "," + j + ")");
                    count++;
                }
            }
        }
        System.out.println("No of good pairs is " + count);
    }
}
