package problems.collectionspractice;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args){
        BitSet b = new BitSet();

        b.set(0);
        b.set(2);
        b.set(4);
        b.set(6);
        b.set(8);

        System.out.println(b.get(2));
    }
}
