class P extends Thread{
    StringBuffer b;
    P(){
        b = new StringBuffer(2);
    }
    public void run() {
        synchronized (b) {
            try {
                for(int i=0;i<b.capacity();i++) {
                    System.out.println("Produced " + i);
                    b.append(i);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            b.notify();
        }
    }
}
class C extends Thread{
    P obj;
    C(P obj){
        this.obj = obj;
    }
    public void run(){
        synchronized (obj.b){
            try{
                obj.b.wait();
                for (int i=0;i<obj.b.capacity();i++){
                    System.out.println("Consumed " + obj.b.charAt(i));
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException{
        P obj = new P();
        C obj1 = new C(obj);
        obj1.start();
        obj.start();
    }
}
