package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1 = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        if(c1.equals(c2))
            System.out.println(s1 + " and " + s2 + " are anagrams");
        else
            System.out.println(s1 + " and " + s2 + " are not anagrams");
    }
}
