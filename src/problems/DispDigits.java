package problems;

import java.util.Scanner;

public class DispDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int digit = number;
        while(digit != 0){
            int remainder = digit % 10;
            System.out.println(remainder);
            digit /= 10;
        }
    }
}
