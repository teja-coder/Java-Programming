package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.addFirst("B");
        ll.addLast("C");
        ll.add("D");
        ll.add(1,"E");
        ll.add("F");
        System.out.println("LinkedList data : " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("after removing first and last : " + ll);
        ll.remove(1);
        ll.remove("D");
        System.out.println("after deleting : " + ll);
        System.out.println("String in pos 0 is " + ll.get(0));
        System.out.println("Contains A? :" + ll.contains("A"));
        System.out.println("Is empty ? :" + ll.isEmpty());
        ll.clear();
        System.out.println("Is empty ? :" + ll.isEmpty());
    }
}
