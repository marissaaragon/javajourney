package problems.collectionspractice;

import java.util.Arrays;
import java.util.Comparator;

class MyC implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args){
        int[] a = {2,4,6,7,1,3,8};
        int[] b = {3,1,6,9,5,8,2};


        int[] c = Arrays.copyOf(a,4);

        Arrays.sort(a);

        for(int x:a)
            System.out.println(x);

        //System.out.println(Arrays.compare(a,b));
    }
}
