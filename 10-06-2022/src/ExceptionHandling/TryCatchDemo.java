package ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int n1,n2;
        try{
            n1=0;
            n2=100/n1;
            System.out.println("End of try block");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0 error");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("Out of try-catch block");
    }
}
