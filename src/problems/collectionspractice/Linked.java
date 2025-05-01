package problems.collectionspractice;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<Integer>(List.of(75,55,44,32));

        ll1.add(50);
        ll1.add(70);
        ll1.addAll(ll2);

        ll1.forEach(System.out::println);


    }
}
