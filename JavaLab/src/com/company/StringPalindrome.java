package com.company;


public class StringPalindrome {
    public static void main(String[] args) {
        String rev="";
        for (int i = args[0].length()-1; i >= 0; i--) {
            rev += args[0].charAt(i);
        }
        if(args[0].equals(rev))
            System.out.println(args[0] + " is a palindrome");
        else
            System.out.println(args[0] + " is not a palindrome");
    }
}
