class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("exception occurred");
            }
        }
    }
}
public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 t = new MyThread5();
        t.start();
        t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
