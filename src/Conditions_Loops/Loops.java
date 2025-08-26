package Conditions_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Loops

        /*
        Syntax of for loop :
        for(initialization; condition; increment/ decrement)
        {
        //body
        }
        */


        //        Q: Print number from 1 to 5

        for (int i=0; i<5; i++){
            System.out.println(i);
        }

//        Print number from 1 to n
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        for ( int i = 0; i<=n ;i++){
            System.out.println(i);
        }

//      while loops
        /*
        Syntax:
        while(condition){
        //body
        }
        */
        int num = 1;
        while(num <=5){
            System.out.println(num);
            num++;
        }

//        do while loop
        /*
        do
        { //body
        }
        while();
        */
        int p = 1;
        do {
            //run at least one time
            System.out.println(p);

        }while(p!=1);


    }
}
