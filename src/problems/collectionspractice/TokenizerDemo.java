package problems.collectionspractice;

import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args){
        String data = "name=Marissa;country=USA;dept=CS";
        StringTokenizer stk = new StringTokenizer(data,"=;");
        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }

    }
}
