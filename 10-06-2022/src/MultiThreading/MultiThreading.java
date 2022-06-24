package MultiThreading;
class Thread1 implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread1 obj2 = new Thread1();
        Thread t1 = new Thread(obj1,"Thread1");
        Thread t2 = new Thread(obj2,"Thread2");
        t1.start();
        t2.start();
    }
}
