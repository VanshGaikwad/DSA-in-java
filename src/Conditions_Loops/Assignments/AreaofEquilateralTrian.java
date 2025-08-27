package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaofEquilateralTrian {
    public static void main(String[] args) {
//        Area of equilateral triangle
//        (sqrt (3))/4) *a*a
        Scanner scn = new Scanner( System.in );
        System.out.print("Enter Side of Equilateral triangle:");
        double a = scn.nextDouble();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.printf("Area of Equilateral triangle: %.2f",area);
    }
}
