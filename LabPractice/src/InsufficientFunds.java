import java.util.Scanner;

class UserDefinedException extends Exception{
    UserDefinedException(String s){
        super(s);
    }
}
public class InsufficientFunds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bal = 10000;
        System.out.println("Enter amount to withdraw : ");
        int amt = in.nextInt();
        try {
            if (amt > bal) {
                throw new UserDefinedException("Insufficient funds");
            } else {
                System.out.println("Balance is " + (bal - amt));
            }
        }
        catch(UserDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}
