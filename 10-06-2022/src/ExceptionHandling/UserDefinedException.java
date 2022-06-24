package ExceptionHandling;

import java.util.Scanner;

class UserDefined extends Exception{
    UserDefined(String s){
        super(s);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = in.nextInt();
        try{
            if(age<18){
                throw new UserDefined("Age must be greater than 18");
            }
        }
        catch(UserDefined e){
            System.out.println(e.getMessage());
        }
    }
}
