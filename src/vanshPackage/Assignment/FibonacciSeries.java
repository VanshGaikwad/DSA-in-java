package vanshPackage.Assignment;
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scn.nextInt();

        int currNum = 0; // first number
        int nextNum = 1; // second number

        for (int i=1;i<=n;i++){
            System.out.print(currNum+" ");
            int newNum = currNum + nextNum;
            currNum = nextNum;
            nextNum = newNum;
        }




    }
}
