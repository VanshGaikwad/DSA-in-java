package vanshPackage.Assignment;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Program for calculating Simple Interest");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principle:");
        double P = scn.nextDouble();
        System.out.print("Enter Rate of Interest:");
        double R = scn.nextDouble();
        System.out.print("Enter Time (in years):");
        double T = scn.nextDouble();

        double SI = (P * R * T) /100;
        System.out.println("Simple Interest = "+SI);
    }
}
