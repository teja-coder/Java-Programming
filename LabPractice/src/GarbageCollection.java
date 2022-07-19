class Test extends Object{
    public void finalize(){
        System.out.println("Object destroyed");
    }
}
public class GarbageCollection {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        t1=null;
        t2=null;
        System.gc();
    }
}
