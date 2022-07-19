import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Balkrishna");
        ll.add("Chiru");
        ll.add("Nag");
        ll.add("Ravi Teja");
        ListIterator itr = ll.listIterator();
        while(itr.hasNext()){
            String s = (String) itr.next();
            if(s.equals("Balkrishna"))
                itr.remove();
            if(s.equals("Chiru"))
                itr.set("Charan");
            if(s.equals("Nag"))
                itr.add("Chai");
        }
        System.out.println(ll);
    }
}
