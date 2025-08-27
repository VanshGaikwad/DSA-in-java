package Switch;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter Fruit name:");
//        String fruit = scn.next();


//        switch (fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        System.out.println("Enter day value:");
        int day = scn.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
