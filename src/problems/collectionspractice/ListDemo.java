package problems.collectionspractice;
import java.util.*;

public class ListDemo {
    public static void main(String[] args){
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80));

        al1.add(1);
        al1.add(0, 20);
        al1.addAll(al2);

        System.out.println(al1.contains(50));
        System.out.println(al1.get(3));
        System.out.println(al1.lastIndexOf(50));

        System.out.println(al1);

        /*for (int i=0; i<al1.size(); i++){
            System.out.println(al1.get(i));
        }
        */

        al1.forEach(System.out::println);

    }
}
