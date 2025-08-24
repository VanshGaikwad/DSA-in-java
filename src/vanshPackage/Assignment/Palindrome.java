package vanshPackage.Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String reversed="";
        for ( int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)){
            System.out.println("string "+ str+ " is palidrome");
        }
        else {
            System.out.println("string "+ str+ "is not palidrome");
        }
    }
}
