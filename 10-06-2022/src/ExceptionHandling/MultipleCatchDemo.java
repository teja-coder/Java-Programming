package ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[10] = 60 / 0;
            System.out.println("End of try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occured");
        } catch (ArithmeticException e) {
            System.out.println("Arithematic exception occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
        System.out.println("End of try-catch block");
    }
}
