package vanshPackage.Assignment;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int number = input.nextInt();
        //Normal Program

//        if(number % 2 == 0){
//            System.out.println("Number is Even");
//        }
//        else {
//            System.out.println("Number is Odd");
//        }

//        using Bitwise operator
//        if last bit (LSB) is 0 -> number is even
//        if last bit (LSB) is 1 -> number is odd

        if((number & 1)==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

    }
}
