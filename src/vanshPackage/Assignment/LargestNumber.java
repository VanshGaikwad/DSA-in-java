package vanshPackage.Assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = scn.nextInt();
        System.out.print("Enter second number:");
        int num2 = scn.nextInt();

        if (num1>num2){
            System.out.println("Num1 :"+ num1 +" is greater than Num2: "+num2);
        } else if (num2>num1) {
            System.out.println("Num2 :"+ num2 +" is greater than Num1: "+num1);
        }
        else {
            System.out.println("Numbers are equal");
        }


    }
}
