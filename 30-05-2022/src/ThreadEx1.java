class MyThread extends Thread{
    public void run(){
        System.out.println("running thread...");
    }
}
public class ThreadEx1{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
