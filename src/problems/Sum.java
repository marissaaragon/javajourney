package problems;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("The sum of number " + n + " is " + sum);
    }
}
