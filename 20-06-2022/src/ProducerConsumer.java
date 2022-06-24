class p extends Thread{
    StringBuffer b ;
    p(){
        b= new StringBuffer(5);

    }
    public void run(){
        synchronized (b){
            try{
                for (int i = 0; i < b.capacity(); i++) {
                    b.append(i);
                    System.out.println("Produced " + i);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("BUFFER is full");
            b.notify();
        }
    }

}


class c extends Thread{
    p obj;
    c(p temp){
        obj = temp;
    }
    public void run(){
        synchronized (obj.b){
            System.out.println("Consuming data");
            try{
                obj.b.wait();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            for (int i = 0; i < obj.b.capacity(); i++) {
                System.out.println("Consumed "+ obj.b.charAt(i));
            }
            System.out.println("Buffer is empty");
        }
    }
}
public class ProducerConsumer extends Thread{
    public static void main(String[] args) {
        p obj = new p();
        c obj2 = new c(obj);
        obj2.start();
        obj.start();

    }
}