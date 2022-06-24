package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("rat");
        al.add("teja");
        al.add('a');
        al.add(null);
        al.add(10);
        System.out.println("ArrayList data : " + al);
        System.out.println("ArrayList size : " + al.size());
        al.add(1,"Hello");
        System.out.println("after adding objects ArrayList size : " + al.size());
        System.out.println("ArrayList data : " + al);
        al.remove(1);
        al.remove("hello");
        System.out.println("after removing ArrayList size : " + al.size());
        System.out.println("ArrayList data : " + al);
        System.out.println("ArrayList Empty ? : " + al.isEmpty());
        al.clear();
        System.out.println("ArrayList Empty ? : " + al.isEmpty());
    }
}
