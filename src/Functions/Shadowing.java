package Functions;

public class Shadowing {
//    shadowing
    static  int x = 90 ;
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40 ;
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x); //90
    }
}
