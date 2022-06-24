package MultiThreading;

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread running ...");
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread th = new Thread(t);
        th.start();
    }
}
