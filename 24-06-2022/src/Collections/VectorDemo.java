package Collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(10);
        v.addElement(20);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
