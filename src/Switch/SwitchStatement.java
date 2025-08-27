package Switch;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Fruit name:");
        String fruit = scn.next();


        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
