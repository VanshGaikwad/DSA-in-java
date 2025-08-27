package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
//        Area of rhombus
//        formula: 1/2 * d1 * d2
        Scanner scn = new Scanner( System.in );
        System.out.print("Enter first diagonal (d1):");
        double d1 = scn.nextDouble();
        System.out.print("Enter first diagonal (d2):");
        double d2 = scn.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.printf("Area of Rhombus :%.2f",area);

    }
}
