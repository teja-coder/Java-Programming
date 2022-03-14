package com.company;

import java.util.Scanner;

public class DiffSumProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int num = n;
        int sum = 0;
        int product = 1;
        while(num>0){
            int dig = num%10;
            sum += dig;
            product *= dig;
            num = num/10;
        }
        System.out.println("The sum of digits is "+ sum);
        System.out.println("The product of digits is " + product);
        System.out.print("The difference between sum and product of digits of " + n + " is ");
        System.out.println(product-sum);

    }
}
