package Conditions_Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().trim().charAt(0);
        //System.out.println(scn.next().trim());
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else if (ch >='A' && ch<='Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
