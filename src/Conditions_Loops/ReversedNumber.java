package Conditions_Loops;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scn.nextInt();
        int ans =0;
        while(num > 0){
            int rem = num % 10;
            num /=10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reversed number : "+ ans);
    }
}
