package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        Area of circle
//        formula pie r^2
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r = scn.nextDouble();
        double area = Math.PI * (r*r);
        System.out.printf("Area of circle : %.2f",area);
    }
}
