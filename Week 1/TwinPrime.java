package com.company;
//1. Write a Java program to print all the twin primes below 1000. (A twin prime is a
//        prime number that differs from another prime number by two. (3, 5), (5, 7), (11, 13),
//        (17, 19), (29, 31), (41, 43), .821, 823), etc. .

public class TwinPrime {
    public static void main(String[] args) {
        int n = 1000;
        for(int i=2;i<n;i++){
            if(isPrime(i) && isPrime(i+2))
                System.out.println("("+i+","+(i+2)+")");
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

