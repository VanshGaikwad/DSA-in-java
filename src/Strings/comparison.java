package Strings;

public class comparison {
    public static void main(String[] args) {
//        comparison of strings
//        1) == method this is comparator
        /*
        a --> "Vansh"
        b --> "Vansh"
        a==b will give you true
        checks if reference variable is pointing to same object

      */
        String a ="vansh";
        String b ="vansh";
        System.out.println(a==b);

//        How to create different object of same variable
        String c = new String ("vansh");
        String d = new String ("vansh");
//        value is same but object is different because of new keyword
        System.out.println(c == d);

//        When you only need to check value , use == method


//        equals method just check value inside variable not check reference variable pointing to same object
//        its just check value

        System.out.println(c.equals(d));


        String name = "Vansh";
        System.out.println(name.charAt(0));
    }
}
