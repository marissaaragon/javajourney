package problems.collectionspractice;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        pq.add(15);

        System.out.println(pq.peek());

        pq.forEach(System.out::println);
    }
}
