package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
//        Area of triangle
//        formula : 1/2 * base * height
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Base:");
        double  base= scn.nextDouble();
        System.out.print("Enter Height:");
        double  height= scn.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle : %.2f",area);
    }
}
