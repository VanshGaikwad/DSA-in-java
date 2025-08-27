package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
//        Area of isosceles triangle
//        formula : 1/2 * b *  sqrt (a^2 - b^2 /4.0)
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter equal side (a):");
        double a = scn.nextDouble();
        System.out.print("Enter value of base:");
        double b = scn.nextDouble();
        double height = Math.sqrt(a*a - (b*b) /4.0);
        double area = 0.5 * b * height;
        System.out.printf("Area of Isosceles Triangle : %.2f",area);

    }
}
