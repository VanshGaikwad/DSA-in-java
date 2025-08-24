package vanshPackage.Assignment;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = scn.nextInt();
        System.out.print("Enter second number :");
        int num2 = scn.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scn.next().charAt(0);

        double result =0;
        if(operator == '+'){
            result = num1 + num2;
            System.out.println("Addition : "+ result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction:"+ result);
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication:"+ result);
        }
        else if(operator == '/'){
            if(num2 != 0){
                result = num1 / num2;
                System.out.println("Division :"+ result);
            }
            else {
                System.out.println("Error ! Division by zero is not allowed ");
            }
        }
        else {
            System.out.println("Invalid operator!");
        }

    }
}
