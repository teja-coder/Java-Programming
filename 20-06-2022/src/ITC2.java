class ThreadB extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("Thread B calculating...");
            total = 100;
            this.notifyAll();
        }

    }
}
class ThreadC extends Thread{
    public void run(){
        ThreadB b = new ThreadB();
        synchronized (b){
            System.out.println("ThreadC waits for ThreadB");
            try {
                b.wait();
            }
            catch(InterruptedException e){

            }
            System.out.println(b.total);
        }

    }
}
public class ITC2 {
    public static void main(String[] args) throws InterruptedException{
        ThreadB b = new ThreadB();
        b.start();
        ThreadC c = new ThreadC();
        c.start();
        synchronized (b){
            System.out.println("main thread waits for ThreadB");
            b.wait();
            System.out.println(b.total);
        }
    }
}