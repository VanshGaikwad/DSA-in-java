package Switch;

import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int time = sc.nextInt();

        switch (day) {
            case 1:
                switch (time) {
                    case 9 -> System.out.println("Monday 9 AM");
                    case 10 -> System.out.println("Monday 10 AM");
                }
                break;
            case 2:
                switch (time) {
                    case 9 -> System.out.println("Tuesday 9 AM");
                    case 10 -> System.out.println("Tuesday 10 AM");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
