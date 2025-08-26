package Conditions_Loops;

public class if_else {
    public static void main(String[] args) {
        int salary = 10000;
        if(salary > 5000){
            salary += 2000;
        }
        else {
            salary += 1000;
        }
        System.out.println("Your Salary + bonus : "+ salary);
    }
}
