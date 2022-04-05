package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = in.next();
        String rev="";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
