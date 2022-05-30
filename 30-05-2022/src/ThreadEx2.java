class MyThread2 implements Runnable{
    public void run(){
        System.out.println("running thread");
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        MyThread2 myth = new MyThread2();
        Thread th = new Thread(myth);
        th.start();
    }
}
