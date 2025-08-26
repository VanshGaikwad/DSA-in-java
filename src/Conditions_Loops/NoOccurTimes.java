package Conditions_Loops;

import java.util.Scanner;

public class NoOccurTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Enter a no. you want to search how many time it occur: ");
        int n = scn.nextInt();

        int count =0;
        while (num > 0){
            int rem = num % 10;
            if(rem == n){
                count++;
            }
            num = num /10;
        }
        System.out.println(n+" Occur "+count+" times");
    }
}
