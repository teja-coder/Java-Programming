import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
