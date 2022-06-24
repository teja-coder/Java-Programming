package MultiThreading;
class MyThread3 extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ThreadNames {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
