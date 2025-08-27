package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
//        Area of rectangle
//        formula : length * width
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length:");
        double length = scn.nextDouble();
        System.out.print("Enter width:");
        double width = scn.nextDouble();
        double area = length * width;
        System.out.printf("Area of Rectangle :%.2f", area);
    }
}
