package problems;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(n + "x" + i + " = " + n*i);


        }
    }
}
