package Conditions_Loops.Assignments;

import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
//        Area of parallelogram
//        formula : base * height
        Scanner scn = new Scanner( System.in );
        System.out.print("Enter base:");
        double base = scn.nextDouble();
        System.out.print("Enter height:");
        double height = scn.nextDouble();

        double area = base * height;
        System.out.printf("Area of Parallelogram :%.2f",area);
    }
}
