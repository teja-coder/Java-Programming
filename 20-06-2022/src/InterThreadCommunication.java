class ThreadA extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("child thread starts calculation");
            total = 100;
            System.out.println("child thread gives notify() call");
            this.notify();
        }

    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException{
        ThreadA t = new ThreadA();
        t.start();
        synchronized (t){
            System.out.println("main thread calling wait()");
            t.wait();
            System.out.println("main thread gets notify() call");
            System.out.println(t.total);
        }
    }
}
