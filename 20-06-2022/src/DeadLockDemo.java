
public class DeadLockDemo {
    public static void main(String[] args) {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread1 locked resource1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("exception occurred");
                    }
                    synchronized (resource2) {
                        System.out.println("Thread1 locked resource2");
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread2 locked resource2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("exception occurred");
                    }
                    synchronized (resource1) {
                        System.out.println("Thread2 locked resource1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
