package com.company.Functions;

import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class PrimeNumbersBetweenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=a;i<=b;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
