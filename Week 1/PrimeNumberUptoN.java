package com.company;

//    5. Write a Java program that prompts the user for an integer and then prints out all
//    prime numbers up to that integer.

import java.util.Scanner;

public class PrimeNumberUptoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
