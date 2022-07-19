public class CheckedException {
    public void student() throws InterruptedException{
        System.out.println("Sleeping..");
        Thread.sleep(2000);
        System.out.println("dont disturb");
    }
    public void hod() throws InterruptedException{
        student();
    }
    public void principal(){
        try{
            hod();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public void officeBoy(){
        principal();
    }
    public static void main(String[] args) {
        CheckedException ce = new CheckedException();
        ce.officeBoy();
    }
}
