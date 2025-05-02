package problems.collectionspractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMap {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lh = new LinkedHashMap<>(5){

        protected boolean removeEldestEntry(Map.Entry e){
            return size()>5;
        }
        };

        lh.put(1,"A");
        lh.put(2,"B");
        lh.put(3,"C");
        lh.put(4,"D");
        lh.put(5,"E");
        lh.put(6,"F");

        lh.forEach((k,v)->System.out.println(k+" " +v));
    }
}
