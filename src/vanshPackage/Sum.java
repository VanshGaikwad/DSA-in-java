package vanshPackage;

import java.util.Scanner;

//sum of two number
public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int num1 = scn.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = scn.nextInt();

        int sum = num1 +num2;

        System.out.println("Sum of two number is= "+sum);
    }

}
