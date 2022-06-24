class MyThread2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("i am lazy thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("i got interrupted");
        }
    }
}
public class ThreadSleep {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        t.interrupt();
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
