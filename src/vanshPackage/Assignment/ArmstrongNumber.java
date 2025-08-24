package vanshPackage.Assignment;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scn.nextInt();

        int numOfdig = String.valueOf(number).length();
        int orginalnum = number;
        int sum =0;
        while (number > 0){
            int last =number%10;
            sum += Math.pow(last,numOfdig);
            number=number/10;
        }
        if (sum == orginalnum){
            System.out.println( "this is Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }

    }
}
