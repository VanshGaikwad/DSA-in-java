package vanshPackage.Assignment;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Currency in INR :");
        double inr = scn.nextDouble();
        double usd = inr/83;
        System.out.printf("Converted USD is : $%.2f", usd);

    }
}
