package problems.collectionspractice;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);

        dq.forEach(System.out::println);
        System.out.println("--------");

        dq.offerFirst(5);
        dq.offerFirst(7);
        dq.pollLast();

        dq.forEach(System.out::println);
    }
}
