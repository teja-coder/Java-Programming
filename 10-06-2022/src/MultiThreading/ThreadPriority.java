package MultiThreading;
class MyThread1 extends Thread{

}
public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        MyThread1 t = new MyThread1();
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
}
