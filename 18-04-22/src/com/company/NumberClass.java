package com.company;

import java.util.Scanner;

/* 3. Create a class Number with only one private instance variable as a double primitive type.
 To include the following methods (include respective constructors) isZero(), isPositive(), isNegative(), isOdd(), isEven(),
  isPrime(), isArmstrong() the above methods return boolean primitive type.
  getFactorial, getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return double primitive type.
  void listFactor(), void dispBinary()
*/
public class NumberClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        Number numObj = new Number(num);
        System.out.println(num + " is zero? : " + numObj.isZero());
        System.out.println(num + " is positive? : " + numObj.isPositive());
        System.out.println(num + " is negative? : " + numObj.isNegative());
        System.out.println(num + " is even? : " + numObj.isEven());
        System.out.println(num + " is odd? : " + numObj.isOdd());
        System.out.println(num + " is prime? : " + numObj.isPrime());
        System.out.println(num + " is armstrong? : " + numObj.isArmstrong());
        System.out.println(num + "! = " + numObj.factorial());
        System.out.println("Square root of " + num +" is " + numObj.getSqrt());
        System.out.println("Square of " + num +" is " + numObj.getSqr());
        System.out.println("Digit sum of " + num + " is " + numObj.sumDigit());
        System.out.println("Reverse of " + num + " is " + numObj.getReverse());
        numObj.listFactors();
        numObj.dispBinary();
    }
}
class Number {
    private int num;
    Number(int num) {
        this.num = num;
    }
    boolean isZero() {
        return num==0;
    }
    boolean isPositive() {
        return num>0;
    }
    boolean isNegative() {
        return num<0;
    }
    boolean isEven() {
        return num%2==0;
    }
    boolean isOdd() {
        return num%2==1;
    }
    boolean isPrime() {
        if(num<2)
            return false;
        for(int i=2;i<Math.sqrt(num);i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
    boolean isArmstrong() {
        int n = num;
        int s = 0;
        while(n>0) {
            int r = n%10;
            s += r*r*r;
            n = n/10;
        }
        if(s==num)
            return true;
        else
            return false;
    }
    int factorial() {
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact *= i;
        }
        return fact;
    }
    double getSqrt() {
        return Math.sqrt(num);
    }
    int getSqr() {
        return num*num;
    }
    int sumDigit() {
        int n = num;
        int sum = 0;
        while(n>0) {
            int r = n%10;
            sum += r;
            n = n/10;
        }
        return sum;
    }
    int getReverse() {
        int n = num;
        int rev = 0;
        while(n>0) {
            int r=n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        return rev;
    }
    void listFactors() {
        if(num<1)
            System.out.println(num + " doesn't have factors");
        else {
            System.out.print("The factors of " + num + " are ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    void dispBinary() {
        int n = num;
        int s = 0;
        int i = 0;
        while(n>0) {
            int r= n%2;
            s = s + r*(int)Math.pow(10,i);
            n = n/2;
            i++;
        }
        System.out.println("The binary representation of " + num + " is " + s);
    }
}