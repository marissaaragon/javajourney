package problems.collectionspractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTable {
    public static void main(String[] args){
        Hashtable ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.computeIfAbsent(7,(k)->"Z");

        String s = (String) ht.get(3);

        Enumeration e = ht.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println(ht);
    }
}
