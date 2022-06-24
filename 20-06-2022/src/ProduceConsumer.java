class Producer extends Thread{
    StringBuffer b;
    public void run(){
        
    }
}
class Consumer extends Thread{
    Producer p;
    Consumer(Producer p){
        this.p=p;
    }
    public void run(){
        System.out.println("Consuming..");
        try{
            p.b.wait();
        }
        catch(InterruptedException e){
            System.out.println("Exception");
        }
        System.out.println("Consumed");
    }
}
public class ProduceConsumer {
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer(p);
        c.start();
        p.start();
    }
}
