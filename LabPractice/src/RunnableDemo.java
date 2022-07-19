class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        MyThread2 t2 = new MyThread2();
        t.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
