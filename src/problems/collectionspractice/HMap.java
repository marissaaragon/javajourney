package problems.collectionspractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class HMap {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        hm.put(4,"E");
        hm.put(5,"F");

        System.out.println(hm);
    }
}
