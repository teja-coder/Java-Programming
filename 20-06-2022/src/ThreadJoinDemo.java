//class MyThread extends Thread{
//    static MyThread mt;
//    public void run(){
//        try{
//            mt.join();
//        }
//        catch(InterruptedException e){
//            System.out.println("InterruptedException");
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("child thread");
//        }
//    }
//}
//public class ThreadJoinDemo {
//    public static void main(String[] args) {
//        MyThread mt = Thread.currentThread();
//        MyThread t = new MyThread();
//        t.start();
//        for(int i=0;i<5;i++){
//            try {
//                Thread.sleep(2000);
//            }
//            catch(InterruptedException e){
//                System.out.println("InterruptedException");
//            }
//            System.out.println("main thread");
//        }
//    }
//}
