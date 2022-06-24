package ExceptionHandling;

public class CheckedException {
    void studentDetails() throws InterruptedException{
        System.out.println("Sleeping");
        Thread.sleep(1000);
        System.out.println("Do not disturb");
    }
    void hod() throws InterruptedException {
        System.out.println("in hod begin");
        studentDetails();
        System.out.println("hod end");
    }
    void principal(){
        System.out.println("principal start");
        try{
            hod();
        }
        catch(InterruptedException e){
            System.out.println("InterruptedException occured");
        }
        System.out.println("principal end");
    }
    void officeBoy(){
        principal();
    }
    public static void main(String[] args) {
        CheckedException ce = new CheckedException();
        ce.officeBoy();
    }
}
