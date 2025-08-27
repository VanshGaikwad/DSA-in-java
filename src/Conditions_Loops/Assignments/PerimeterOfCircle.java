package Conditions_Loops.Assignments;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
//        perimeter of circle
//        2 * pi * r
        Scanner scn = new Scanner( System.in );
        System.out.print("Enter radius:");
        double r = scn.nextDouble();
        double perimeter = 2 * Math.PI * r;
        System.out.printf("Perimeter of Circle: %.2f",perimeter);
    }
}
