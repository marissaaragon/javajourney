package problems.collectionspractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSet {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("A");
        lhs.add("B");
        lhs.add("J");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");

        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
