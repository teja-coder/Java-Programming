package com.company;

import java.util.Scanner;

public class CheckWierd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        if(n%2==1)
            System.out.println("Weird");
        else{
            if(n>=6 && n<=10)
                System.out.println("Not weird");
            else if(n>=15 && n<=25)
                System.out.println("Weird");
            else if(n>=30)
                System.out.println("Not weird");
        }
    }
}
