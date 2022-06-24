package ExceptionHandling;

class InsufficientFunds extends Exception{
    InsufficientFunds(String s){
        super(s);
    }
}
public class UserDefined {
    public static void main(String[] args) {
        int age=13;
        try{
            if(age<18){
                throw new InsufficientFunds("Not valid");
            }
        }
        catch(InsufficientFunds e){
            System.out.println(e.getMessage());
        }
    }
}
