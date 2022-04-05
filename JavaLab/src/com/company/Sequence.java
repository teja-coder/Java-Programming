package com.company;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a,b,n values : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(i==0)
                ans += a + Math.pow(2,i) * b;
            else
                ans += Math.pow(2,i) * b;
            System.out.print(ans + " ");
        }
    }
}
