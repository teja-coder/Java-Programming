package com.company.Functions;

import java.util.Scanner;

public class PythogorasTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(tripletCheck(a,b,c))
            System.out.println(a + "," + b + "," + c + " are pythogoras triplets");
        else
            System.out.println(a + "," + b + "," + c + " are not pythogoras triplets");
    }
    static boolean tripletCheck(int a,int b,int c){
        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
            return true;
        else
            return false;
    }
}
