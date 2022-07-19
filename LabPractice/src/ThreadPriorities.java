class MyThread3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t2.setPriority(Thread.MAX_PRIORITY);
        t.setName("child thread");
        t2.setName("child2");
        t.start();
        t2.start();
        Thread.currentThread().setName("main");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
