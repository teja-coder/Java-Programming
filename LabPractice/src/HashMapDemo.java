import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(100,"Shiva");
        hm.put(200,"Ajay");
        hm.put(300,"Teja");
        System.out.println(hm);
        hm.remove(100);
        hm.replace(300,"Sai");
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            String s = (String)m.getValue();
            System.out.println(m.getKey() + " -- " + s);
        }
    }
}
