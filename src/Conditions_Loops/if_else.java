package Conditions_Loops;

public class if_else {
    public static void main(String[] args) {
        int salary = 10000;
//        if(salary > 5000){
//            salary += 2000;
//        }
//        else {
//            salary += 1000;
//        }
//        System.out.println("Your Salary + bonus : "+ salary);
//
        //multiple if else condition
        if(salary>10000){
            salary += 2000;
        } else if (salary > 20000) {
            salary+=3000;
        }else {
            salary+=4000;
        }
        System.out.println(salary);
    }
}
