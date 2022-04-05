package com.company;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        String[] words = new String[n];
        System.out.print("Enter strings : ");
        for(int i=0;i<words.length;i++){
            words[i] = in.next();
        }
        for (int i = 0; i < words.length; i++) {
            int vowel=0,consonant=0;
            for (int j = 0; j < words[i].length(); j++) {
                char s = words[i].toLowerCase().charAt(j);
                if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
                    vowel++;
                else
                    consonant++;
            }
            System.out.println(words[i] + "   Vowels: " + vowel + "   consonants: " + consonant);
        }
    }
}
