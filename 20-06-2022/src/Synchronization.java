class Message{
    public synchronized void greet(String s){
        for(int i=0;i<3;i++) {
            System.out.println("good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            System.out.println(s);
        }
    }
}
class MyThread3 extends Thread{
    Message m;
    String name;
    MyThread3(Message m,String name) {
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.greet(name);
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Message m = new Message();
        MyThread3 mt1 = new MyThread3(m,"teja");
        MyThread3 mt2 = new MyThread3(m,"Irfan");
        mt1.start();
        mt2.start();
    }
}
