class MyThread4 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("child thread");
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
